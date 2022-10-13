package com.mAadhar.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mAadhar.bean.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
	@Query("select u from User u where u.uadhar=:uadhar")
	public List<User> findUserByuadhar(@Param("uadhar") float uadhar);

}