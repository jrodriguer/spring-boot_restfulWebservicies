package com.jrodriguer.rest.webservicies.restfulwebservicies.recipebook;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jrodriguer.rest.webservicies.restfulwebservicies.recipebook.models.Recipe;

@Repository
public interface RecipeSpringDataJpaRepository extends JpaRepository<Recipe, Long> {

  List<Recipe> findByName(String name);

}
