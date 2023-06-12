package com.exam.examserver.service.implementation;

import com.exam.examserver.model.exam.Category;
import com.exam.examserver.repository.CategoryRepository;
import com.exam.examserver.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.Set;
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepo;

    @Override
    public Category addCategory(Category category) {
        return this.categoryRepo.save(category);
    }

    @Override
    public Category updateCategory(Category category) {
        return this.categoryRepo.save(category);
    }

    @Override
    public Set<Category> getCategories() {
        return new LinkedHashSet<>(this.categoryRepo.findAll());
    }

    @Override
    public Category getCategory(Long categoryId) {
        return this.categoryRepo.findById(categoryId).get();
    }

    @Override
    public void deleteCategory(Long categoryId) {

       /* Category category = new Category();
        category.setCid(categoryId);
        this.categoryRepo.delete(category);*/

           //OR
        this.categoryRepo.deleteById(categoryId);
    }
}
