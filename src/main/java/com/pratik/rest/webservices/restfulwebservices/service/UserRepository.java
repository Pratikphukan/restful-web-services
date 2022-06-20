package com.pratik.rest.webservices.restfulwebservices.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pratik.rest.webservices.restfulwebservices.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
