package com.jrodriguer.rest.webservicies.restfulwebservicies.recipebook.ingredient;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.jrodriguer.rest.webservicies.restfulwebservicies.recipebook.recipe.Recipe;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Ingredient {

  protected Ingredient() {
  }

  @Id
  @GeneratedValue
  private Integer id;

  @ManyToOne(fetch = FetchType.LAZY)
  @JsonIgnore
  private Recipe recipe;

  @Column(name = "INGREDIENT_NAME", nullable = false, unique = false)
  @JsonProperty("ingredient_name")
  private String name;

  @Column(name = "INGREDIENT_AMOUNT", nullable = false, unique = false)
  @JsonProperty("ingredient_amount")
  private Integer amount;

  public Ingredient(Integer id, String name, Integer amount) {
    super();
    this.id = id;
    this.name = name;
    this.amount = amount;
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

  public Integer getAmount() {
    return amount;
  }

  public void setAmount(Integer amount) {
    this.amount = amount;
  }

}