package com.numberspam.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.numberspam.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>
{
    boolean existsByNumber(Long number);
    List<User> findByNameContaining(String name);
    
}
