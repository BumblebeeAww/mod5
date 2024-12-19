package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class RecipeUtilsTest {

    @Test
    public void testAddAndFindRecipe() {
        RecipeUtils recipeUtils = new RecipeUtils();
        Recipe recipe = new Recipe("Pasta", "Noodles, Sauce", "Boil noodles and add sauce.");
        recipeUtils.addRecipe(recipe);

        Recipe foundRecipe = recipeUtils.findRecipeByName("Pasta");
        assertNotNull(foundRecipe);
        assertEquals("Pasta", foundRecipe.getName());
        assertEquals("Noodles, Sauce", foundRecipe.getIngredients());
        assertEquals("Boil noodles and add sauce.", foundRecipe.getInstructions());
    }

    @Test
    public void testFindRecipeNotFound() {
        RecipeUtils recipeUtils = new RecipeUtils();
        Recipe foundRecipe = recipeUtils.findRecipeByName("NonExistentRecipe");
        assertNull(foundRecipe);
    }
}
