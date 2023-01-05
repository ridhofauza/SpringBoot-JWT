/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jwtlearning.expensetrackerapi.services;

import com.jwtlearning.expensetrackerapi.Exceptions.EtBadRequestException;
import com.jwtlearning.expensetrackerapi.Exceptions.EtResourceNotFoundException;
import com.jwtlearning.expensetrackerapi.dto.Category;
import java.util.List;

/**
 *
 * @author user
 */
public interface CategoryService {
  
    List<Category> fetchAllCategories(Integer userId);
    
    Category fetchCategoryById(Integer userId, Integer categoryId) throws EtResourceNotFoundException;
    
    Category addCategory(Integer userId, String title, String description) throws EtBadRequestException;
    
    void updateCategory(Integer userId, Integer categoryId, Category category) throws EtBadRequestException;
    
    void removeCategoryWithAllTransactions(Integer userId, Integer categoryId) throws EtResourceNotFoundException;
    
}
