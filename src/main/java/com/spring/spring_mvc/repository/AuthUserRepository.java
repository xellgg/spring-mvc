package com.spring.spring_mvc.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.spring_mvc.entity.Auth_User;

public interface AuthUserRepository extends JpaRepository<Auth_User, Long> {
    
    Optional<Auth_User> findByUsername(String theUsername);
    Boolean existsByUsername(String theUsername);

}
