package xyz.bnayagrawal.springrecipeapp.services;

import xyz.bnayagrawal.springrecipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}