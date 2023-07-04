package com.jrodriguer.rest.webservicies.restfulwebservicies.recipebook.beans;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

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

    @OneToMany(mappedBy = "recipe")
    @JsonProperty("recipe_ingredients")
    private List<Ingredient> ingredients;

    public Recipe(Integer id, String name, String description) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
    }

}