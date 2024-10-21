package org.educandoweb.projetojpawebservicecomspringboot.services;

import org.educandoweb.projetojpawebservicecomspringboot.entities.Product;
import org.educandoweb.projetojpawebservicecomspringboot.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {


    private final ProductRepository productRepository;

    public ProductService(ProductRepository ProductRepository) {
        this.productRepository = ProductRepository;
    }

    public List<Product> findAll() {
        return productRepository.findAll();

    }

    public Product findById(Long id) {
        Optional<Product> obj = productRepository.findById(id);
        return obj.get();
    }
}
