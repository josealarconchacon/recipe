package org.example.recipe.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
public class Recipe {
//    add annotation for the primary key
    @Id
    @GeneratedValue
    private Long id;
//    add annotation for name
    @Column(name = "name")
    private String name;
//    add annotation for ingredients
    @Column(name = "ingredients", length = Integer.MAX_VALUE)
    private String ingredients;


    // default constructor
    public Recipe() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }
}
