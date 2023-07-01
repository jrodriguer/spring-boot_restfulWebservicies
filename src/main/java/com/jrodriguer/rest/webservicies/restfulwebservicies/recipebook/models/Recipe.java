package com.jrodriguer.rest.webservicies.restfulwebservicies.recipebook.models;

import java.util.List;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "RECIPE")
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "RECIPE_NAME", length = 50, nullable = false, unique = false)
    private String name;

    @Column(name = "RECIPE_DESCRIPTION", nullable = false, unique = false)
    private String description;

    @ElementCollection
    @CollectionTable(name = "RECIPE_INGREDIENTS")
    private List<String> ingredients;

    public Recipe() {
    }

    public Recipe(Long id, String name, String description) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
    }

}