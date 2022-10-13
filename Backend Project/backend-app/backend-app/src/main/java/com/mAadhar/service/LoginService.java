package com.mAadhar.service;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mAadhar.repository.LoginRepository;
import com.mAadhar.bean.Login;

@Service
public class LoginService {
	@Autowired
	LoginRepository loginrepository;
	
	public String signIn(Login login) 
	{
		Optional<Login> result = loginrepository.findById(login.getEmailid());
		if(result.isPresent()) 
		{
			Login ll = result.get();
			if(ll.getPassword().equals(login.getPassword())) 
			{
				if(login.getRole().equals(ll.getRole()) || login.getRole().equals("admin")) 
				{
					return "Admin SuccessFully Login";
				}
				else if(login.getRole().equals(ll.getRole()) && login.getRole().equals("user")) 
				{
					return "User Successfully Login";
				}
				else 
				{
					return "Invalid details";
				}
				
			}
			else 
			{
				return "Invalid Password";
			}
			
		}
		else 
		{
			return "Invalid Emailid";
		}
		
	}
	public String signUp(Login login) 
	{
		Optional<Login> result = loginrepository.findById(login.getEmailid());
		if(result.isPresent()) 
		{
			return "EmailId already Exist";
			
		}
		else 
		{
			//Login ll = result.get();
			if(login.getRole().equals("admin")) 
			{
				return "you can not create admin account";
			}
			else 
			{
				loginrepository.save(login);
				return "Account created successfully";
			}
		}
		
	}

}