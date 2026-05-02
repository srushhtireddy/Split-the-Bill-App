package com.splitbill.splitbill.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "users")   // ⭐ THIS FIXES YOUR ERROR
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
}