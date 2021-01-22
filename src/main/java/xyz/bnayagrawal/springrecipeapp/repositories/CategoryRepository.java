package xyz.bnayagrawal.springrecipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import xyz.bnayagrawal.springrecipeapp.domain.Category;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);
}
