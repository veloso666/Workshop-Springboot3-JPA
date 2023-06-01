package com.jlvatejo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jlvatejo.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
