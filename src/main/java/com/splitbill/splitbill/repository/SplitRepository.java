package com.splitbill.splitbill.repository;

import com.splitbill.splitbill.model.Split;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SplitRepository extends JpaRepository<Split, Long> {
}