package com.jrodriguer.rest.webservicies.restfulwebservicies.recipebook.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "RECIPE")
public class Recipe {

    protected Recipe() {
    }

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "RECIPE_NAME", nullable = false, unique = false)
    @JsonProperty("recipe_name")
    private String name;

    @Column(name = "RECIPE_DESCRIPTION", nullable = false, unique = false)
    @JsonProperty("recipe_description")
    private String description;

    @ElementCollection
    @CollectionTable(name = "RECIPE_INGREDIENTS")
    @JsonProperty("recipe_ingredients")
    private List<String> ingredients;

    public Recipe(Integer id, String name, String description, List<String> ingredients) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.ingredients = ingredients;
    }

}