package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RecipeUtils recipeUtils = new RecipeUtils();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Выберите действие:");
            System.out.println("1. Добавить рецепт");
            System.out.println("2. Найти рецепт по имени");
            System.out.println("3. Выход");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Считываем новую строку после ввода числа

            switch (choice) {
                case 1:
                    // Добавление рецепта
                    System.out.println("Введите имя рецепта:");
                    String name = scanner.nextLine();
                    System.out.println("Введите ингредиенты (через запятую):");
                    String ingredients = scanner.nextLine();
                    System.out.println("Введите инструкции:");
                    String instructions = scanner.nextLine();

                    Recipe recipe = new Recipe(name, ingredients, instructions);
                    recipeUtils.addRecipe(recipe);
                    System.out.println("Рецепт добавлен!");
                    break;

                case 2:
                    // Поиск рецепта
                    System.out.println("Введите имя рецепта для поиска:");
                    String searchName = scanner.nextLine();
                    Recipe foundRecipe = recipeUtils.findRecipeByName(searchName);

                    if (foundRecipe != null) {
                        System.out.println("Рецепт найден!");
                        System.out.println("Имя: " + foundRecipe.getName());
                        System.out.println("Ингредиенты: " + foundRecipe.getIngredients());
                        System.out.println("Инструкции: " + foundRecipe.getInstructions());
                    } else {
                        System.out.println("Рецепт не найден.");
                    }
                    break;

                case 3:
                    // Выход
                    running = false;
                    System.out.println("Выход из программы.");
                    break;

                default:
                    System.out.println("Неверный выбор. Пожалуйста, попробуйте снова.");
                    break;
            }
        }

        scanner.close();
    }
}
