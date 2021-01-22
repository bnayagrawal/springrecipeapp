package xyz.bnayagrawal.springrecipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import xyz.bnayagrawal.springrecipeapp.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
