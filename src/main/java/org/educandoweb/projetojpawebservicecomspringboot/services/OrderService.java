package org.educandoweb.projetojpawebservicecomspringboot.services;

import org.educandoweb.projetojpawebservicecomspringboot.entities.Order;
import org.educandoweb.projetojpawebservicecomspringboot.repositories.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {


    private final OrderRepository orderRepository;

    public OrderService(OrderRepository OrderRepository) {
        this.orderRepository = OrderRepository;
    }

    public List<Order> findAll() {
        return orderRepository.findAll();

    }

    public Order findById(Long id) {
        Optional<Order> obj = orderRepository.findById(id);
        return obj.get();
    }
}
