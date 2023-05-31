package com.jrodriguer.rest.webservicies.restfulwebservicies.recipebook.model;

import java.util.List;

import org.springframework.data.annotation.Id;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Recipe {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @ElementCollection
    @CollectionTable(name = "recipe_ingredients")
    private List<String> ingredients;

}