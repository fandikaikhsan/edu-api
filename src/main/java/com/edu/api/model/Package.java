package com.edu.api.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Package {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String description;

    @Setter
    @Getter
    @ManyToOne
//    @JoinColumn(name = "group_id")
    private Group group;

}
