package com.numberspam.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.numberspam.entity.SpamAccounts;
import com.numberspam.repository.SpamRepository;

@RestController
@RequestMapping("/spam")
public class SpamController
{
	
	@Autowired
	private SpamRepository spamRepository;
	
	@PostMapping("/markSpam/{spam}")
	public ResponseEntity<String> markSpam(@PathVariable("spam") String number) {

	     Optional<SpamAccounts> bySpamNumber = spamRepository.findBySpamNumber(number);

	   
	    if (bySpamNumber.isPresent()) 
	    {
	    	SpamAccounts spamAccounts = bySpamNumber.get();
	    	spamAccounts.setIsSpam(true);
	    	
	    }
	    
	    return ResponseEntity.ok("it is a spam mail");
	}


}
