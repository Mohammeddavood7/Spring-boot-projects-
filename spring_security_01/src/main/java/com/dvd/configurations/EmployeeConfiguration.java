package com.dvd.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class EmployeeConfiguration 
{

    @Bean
   public UserDetailsService userDetailsService(PasswordEncoder pswrd)
	{
	   UserDetails user = User.builder()
			   .username("smith")
			   .password(pswrd.encode("smith"))
			   .roles("user")
			   .build();
	   
	   UserDetails admin = User.builder()
			   .username("scott")
			   .password(pswrd.encode("scott"))
			   .roles("admin")
			   .build();
	   
	    return new InMemoryUserDetailsManager(user,admin);
	}
	
	@Bean
	public PasswordEncoder passwordEncoder()
	{
		return new BCryptPasswordEncoder();
	}
	
	
	

}












