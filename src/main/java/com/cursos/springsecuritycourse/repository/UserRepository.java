package com.cursos.springsecuritycourse.repository;

import com.cursos.springsecuritycourse.entity.Product;
import com.cursos.springsecuritycourse.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface UserRepository extends JpaRepository<User, String> {
    Optional<User> finByUsername(String username);
}
