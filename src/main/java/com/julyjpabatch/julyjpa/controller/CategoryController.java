package com.julyjpabatch.julyjpa.controller;

import com.julyjpabatch.julyjpa.model.Category;
import com.julyjpabatch.julyjpa.repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {

    @Autowired
    private CategoryRepo categoryRepo;

    @PostMapping(value="/savecategory")
    public String saveCategory(@RequestBody Category category){
        categoryRepo.save(category);
        return "Category saved";
    }
}
