package com.jlvatejo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jlvatejo.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
