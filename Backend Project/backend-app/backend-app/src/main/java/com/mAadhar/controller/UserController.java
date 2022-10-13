package com.mAadhar.controller;

import org.springframework.http.MediaType;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mAadhar.service.UserService;
import com.mAadhar.bean.User;

@RestController
@RequestMapping("user")
@CrossOrigin
public class UserController {
	@Autowired
	UserService userservice;
	@PostMapping(value="storeUser",consumes=MediaType.APPLICATION_JSON_VALUE)
	public String storeUser(@RequestBody User user) 
	{
		return userservice.storeUser(user);
		
	} 
	
	@PatchMapping(value="updateUser",consumes=MediaType.APPLICATION_JSON_VALUE)
	public String updteUser(@RequestBody User user) 
	{
		return userservice.updateUser(user);
		
	} 
    
	@GetMapping(value="findAllUser", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<User> getAllUser()
	{
		return userservice.getAllUser();
		
	}
	
	@GetMapping(value="findUserByuadhar/{uadhar}",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<User> findUserByuadhar(@PathVariable("uadhar") float uadhar)
	{
		return userservice.findUserByuadhar(uadhar);
		
	}
	
	@GetMapping(value="findUserByuid/{uid}")
	public String findUserByuid(@PathVariable("uid") int uid)
	{
		return userservice.findUserById(uid);
		
	}
	
	@DeleteMapping(value="deleteUserByuid/{uid}")
	public String deleteUserById(@PathVariable("uid") int uid)
	{
		return userservice.DeleteUser(uid);
		
	}
	
}