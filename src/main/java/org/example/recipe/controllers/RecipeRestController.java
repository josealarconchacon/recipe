package org.example.recipe.controllers;

import org.example.recipe.models.Recipe;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class RecipeRestController {

    @GetMapping("")
    public List<Recipe> listRecipes() {}
    @GetMapping("/{id}")
    public Recipe gerRecipe() {}
    @PostMapping("")
    public Recipe createRecipe(Recipe recipe) {}
    @PutMapping("/{id}")
    public Recipe updateRecipe(Recipe recipe, Long id) {}
    @DeleteMapping("/{id}")
    public Recipe deleteRecipe(Long id) {}
}
