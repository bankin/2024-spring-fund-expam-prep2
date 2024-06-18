package com.bonappetit.model.dto;

import com.bonappetit.model.entity.CategoryName;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class AddRecipeDTO {
    @NotNull
    @Size(min = 2, max = 40)
    private String name;

    @NotNull
    @Size(min = 2, max = 150)
    private String ingredients;

    @NotNull
    private CategoryName category;

    public AddRecipeDTO() {

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

    public CategoryName getCategory() {
        return category;
    }

    public void setCategory(CategoryName category) {
        this.category = category;
    }
}
