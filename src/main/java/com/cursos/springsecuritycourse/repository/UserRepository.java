package com.cursos.springsecuritycourse.repository;

import com.cursos.springsecuritycourse.entity.Product;
import com.cursos.springsecuritycourse.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, String> {
}
