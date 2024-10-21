package org.educandoweb.projetojpawebservicecomspringboot.repositories;

import org.educandoweb.projetojpawebservicecomspringboot.entities.Category;
import org.educandoweb.projetojpawebservicecomspringboot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
