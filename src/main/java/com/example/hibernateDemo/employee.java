package com.example.hibernateDemo;


import javax.persistence.*;
import javax.xml.crypto.Data;
@lombok.Data
@Entity
public class employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "role")
    private String role;

    @Column(name = "salary")
    private int salary;

}