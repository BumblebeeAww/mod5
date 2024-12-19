package com.example;

import java.util.ArrayList;
import java.util.List;

public class RecipeUtils {
    private List<Recipe> recipes; // Список для хранения рецептов

    public RecipeUtils() {
        recipes = new ArrayList<>();
    }

    // Метод для добавления рецепта
    public void addRecipe(Recipe recipe) {
        recipes.add(recipe);
    }

    // Метод для поиска рецепта по имени
    public Recipe findRecipeByName(String name) {
        for (Recipe recipe : recipes) {
            if (recipe.getName().equalsIgnoreCase(name)) {
                return recipe;
            }
        }
        return null; // Если рецепт не найден
    }

    // Метод для отображения информации о рецепте (если нужно)
    public void displayRecipe(Recipe recipe) {
        System.out.println("----- Рецепт -----");
        System.out.println("Имя: " + recipe.getName());
        System.out.println("Ингредиенты: " + recipe.getIngredients());
        System.out.println("Инструкции: " + recipe.getInstructions());
        System.out.println("------------------");
    }
}