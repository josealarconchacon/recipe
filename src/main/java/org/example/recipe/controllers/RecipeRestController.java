package org.example.recipe.controllers;

import org.example.recipe.models.Recipe;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class RecipeRestController {

    @GetMapping("")
    public List<Recipe> listRecipes() {}
    @GetMapping("/{id}")
    public Recipe getRecipe(@PathVariable Long id) {}
    @PostMapping("")
    public Recipe createRecipe(@RequestBody Recipe recipe) {}
    @PutMapping("/{id}")
    public Recipe updateRecipe(@RequestBody Recipe recipe, @PathVariable Long id) {}
    @DeleteMapping("/{id}")
    public Recipe deleteRecipe(@PathVariable Long id) {}
}
