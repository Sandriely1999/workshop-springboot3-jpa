package org.educandoweb.projetojpawebservicecomspringboot.repositories;

import org.educandoweb.projetojpawebservicecomspringboot.entities.Category;
import org.educandoweb.projetojpawebservicecomspringboot.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
