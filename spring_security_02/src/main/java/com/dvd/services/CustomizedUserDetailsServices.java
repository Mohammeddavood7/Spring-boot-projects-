package com.dvd.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.dvd.entity.CustomizedUser;
import com.dvd.repository.CustomizedRepository;

public class CustomizedUserDetailsServices implements UserDetailsService
{

	@Autowired
	private CustomizedRepository customizedRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
	{
		
		Optional<CustomizedUser> byEmail = customizedRepository.findByEmail(username);
		
		if(byEmail.isPresent())
		{
			return byEmail.get();
		}
		else
		{
			throw new UsernameNotFoundException("password is not correct !!!");
		}
	}

}
