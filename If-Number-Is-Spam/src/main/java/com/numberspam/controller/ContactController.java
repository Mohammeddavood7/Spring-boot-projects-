package com.numberspam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.numberspam.entity.Contact;
import com.numberspam.repository.ContactRepository;

@RestController
@RequestMapping("/api")
public class ContactController {

    @Autowired
    private ContactRepository contactRepository;

    @GetMapping("/searchName/{nme}")
    public ResponseEntity<Contact> searchByName(@PathVariable("nme") String name) 
    {
        List<Contact> results = contactRepository.findByContactNameContainingIgnoreCase(name);
        return ResponseEntity.ok(results.get(0));
    }

    @GetMapping("/searchNumber/{number}")
    public ResponseEntity<List<Contact>> searchByPhoneNumber(@PathVariable("number") String phoneNumber) 
    {
        List<Contact> results = contactRepository.findByContactNumber(phoneNumber);
        return ResponseEntity.ok(results);
        
    }
    
    
    
    
}






















