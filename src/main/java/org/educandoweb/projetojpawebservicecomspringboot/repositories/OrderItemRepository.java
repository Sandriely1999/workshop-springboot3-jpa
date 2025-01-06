package org.educandoweb.projetojpawebservicecomspringboot.repositories;

import org.educandoweb.projetojpawebservicecomspringboot.entities.OrderItem;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
