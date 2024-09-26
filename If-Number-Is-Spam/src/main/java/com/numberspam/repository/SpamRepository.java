package com.numberspam.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.numberspam.entity.SpamAccounts;

@Repository
public interface SpamRepository extends JpaRepository<SpamAccounts, Integer> 
{
    Optional<SpamAccounts> findBySpamNumber(String phoneNumber);
}	






















