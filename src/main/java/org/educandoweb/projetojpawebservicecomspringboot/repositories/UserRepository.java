package org.educandoweb.projetojpawebservicecomspringboot.repositories;

import org.educandoweb.projetojpawebservicecomspringboot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
