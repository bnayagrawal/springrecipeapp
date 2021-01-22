package xyz.bnayagrawal.springrecipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import xyz.bnayagrawal.springrecipeapp.domain.UnitOfMeasure;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
    Optional<UnitOfMeasure> findByDescription(String description);
}
