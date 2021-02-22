package xyz.bnayagrawal.springrecipeapp.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import xyz.bnayagrawal.springrecipeapp.domain.Category;
import xyz.bnayagrawal.springrecipeapp.domain.UnitOfMeasure;
import xyz.bnayagrawal.springrecipeapp.repositories.CategoryRepository;
import xyz.bnayagrawal.springrecipeapp.repositories.UnitOfMeasureRepository;

import java.util.Optional;

@Slf4j
@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage() {
        log.debug("Getting index page");
        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");

        System.out.println("Cat Id is:" + categoryOptional.get().getId());
        System.out.println("UOM Id is:" + unitOfMeasureOptional.get().getId());

        return "index";
    }
}
