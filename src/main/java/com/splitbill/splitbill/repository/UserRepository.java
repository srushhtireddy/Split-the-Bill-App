package com.splitbill.splitbill.repository;

import com.splitbill.splitbill.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}