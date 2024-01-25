package org.example.recipe.controllers;

import org.example.recipe.models.Recipe;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/recipes")
public class RecipeRestController {

    public List<Recipe> listRecipes() {}

    public Recipe gerRecipe() {}

    public Recipe createRecipe(Recipe recipe) {}

    public Recipe updateRecipe(Recipe recipe, Long id) {}

    public Recipe deleteRecipe(Long id) {}
}
