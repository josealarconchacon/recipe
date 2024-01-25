package org.example.recipe.controllers;

import org.example.recipe.models.Recipe;
import org.example.recipe.repositories.RecipeJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class RecipeRestController {

    @Autowired
    private RecipeJpaRepository jpaRepository;

    @GetMapping("")
    public List<Recipe> listRecipes() {
        return jpaRepository.findAll();
    }
    @GetMapping("/{id}")
    public Recipe getRecipe(@PathVariable Long id) {
        return jpaRepository.getReferenceById(id);
    }
    @PostMapping("")
    public Recipe createRecipe(@RequestBody Recipe recipe) {
        return jpaRepository.save(recipe);
    }
    @PutMapping("/{id}")
    public Recipe updateRecipe(@RequestBody Recipe recipe, @PathVariable Long id) {
        Recipe update = jpaRepository.getReferenceById(id);
        update.setName(recipe.getName());
        update.setIngredients(recipe.getIngredients());
        return  jpaRepository.save(update);
    }
    @DeleteMapping("/{id}")
    public Recipe deleteRecipe(@PathVariable Long id) {
        return jpaRepository.getReferenceById(id);
    }
}
