package com.numberspam.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.numberspam.entity.Contact;


@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> 
{
    List<Contact> findByContactNameContainingIgnoreCase(String name);
    List<Contact> findByContactNumber(String phoneNumber);
}



















