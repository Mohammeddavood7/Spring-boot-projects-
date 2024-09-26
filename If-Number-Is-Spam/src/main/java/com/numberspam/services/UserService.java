package com.numberspam.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.numberspam.entity.User;
import com.numberspam.model.UserVo;
import com.numberspam.repository.UserRepository;


@Service
public class UserService 
{
	@Autowired
	private UserRepository userRepository;
	
	
	public ResponseEntity<?> registerUser(UserVo userVo)
	{
				
	    if (userRepository.existsByNumber(userVo.getNumber()))
	    {
	        return ResponseEntity.status(HttpStatus.CONFLICT).body("Phone number already registered.");
	    }
	    
	    User user = User.builder()
				.name(userVo.getName())
				.number(userVo.getNumber())
				.password(userVo.getPassword())
				.email(userVo.getEmail())
				.build();
	    userRepository.save(user);
	    return ResponseEntity.ok("User registered successfully.");
	    
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}























