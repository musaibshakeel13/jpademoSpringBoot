package com.example.jpademo;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public interface UserRepository extends
        JpaRepository<UserClassSpringBoot, Long> {
}
