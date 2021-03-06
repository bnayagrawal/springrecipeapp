package xyz.bnayagrawal.springrecipeapp.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import xyz.bnayagrawal.springrecipeapp.services.RecipeService;

@Slf4j
@Controller
@RequestMapping("/recipes")
public class RecipesController {

    private final RecipeService recipeService;

    public RecipesController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getRecipeList(Model model) {
        model.addAttribute("recipes", recipeService.getRecipes());
        return "recipe";
    }
}
