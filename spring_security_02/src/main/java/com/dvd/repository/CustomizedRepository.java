package com.dvd.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dvd.entity.CustomizedUser;

public interface CustomizedRepository extends JpaRepository<CustomizedUser, Long>
{
  Optional<CustomizedUser> findByEmail(String password);

}
