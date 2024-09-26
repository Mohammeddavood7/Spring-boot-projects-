package com.numberspam.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.numberspam.entity.Contact;
import com.numberspam.repository.ContactRepository;

@Service
public class ContactService
{
	
	@Autowired
	private ContactRepository contactRepository;
	
	
	    public ResponseEntity<List<Contact>> searchByName(String name)
	    {
	        List<Contact> results = contactRepository.findByContactNameContainingIgnoreCase(name);
	        return ResponseEntity.ok(results);
	    }

	    public ResponseEntity<List<Contact>> searchByPhoneNumber(String phoneNumber) 
	    {
	        List<Contact> results = contactRepository.findByContactNumber(phoneNumber);
	        return ResponseEntity.ok(results);
	    }
	    
	    

}























