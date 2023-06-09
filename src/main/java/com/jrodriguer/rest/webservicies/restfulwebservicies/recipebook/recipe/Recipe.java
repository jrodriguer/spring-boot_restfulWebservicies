package com.jrodriguer.rest.webservicies.restfulwebservicies.recipebook.recipe;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.jrodriguer.rest.webservicies.restfulwebservicies.recipebook.ingredient.Ingredient;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
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
    // @JsonProperty("recipe_ingredients")
    @JsonIgnore
    private List<Ingredient> ingredients;

    public Recipe(Integer id, String name, String description) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

}