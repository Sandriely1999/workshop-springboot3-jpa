package org.educandoweb.projetojpawebservicecomspringboot.repositories;

import org.educandoweb.projetojpawebservicecomspringboot.entities.Order;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
