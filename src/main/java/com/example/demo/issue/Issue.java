package com.example.demo.issue;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Issue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

   // @OneToOne(cascade = CascadeType.ALL)
    private String name;

    private String author;

    private String description;

}