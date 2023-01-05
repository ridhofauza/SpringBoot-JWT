/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jwtlearning.expensetrackerapi.repositories;

import com.jwtlearning.expensetrackerapi.Exceptions.EtBadRequestException;
import com.jwtlearning.expensetrackerapi.Exceptions.EtResourceNotFoundException;
import com.jwtlearning.expensetrackerapi.dto.Category;
import java.util.List;

/**
 *
 * @author user
 */
public interface CategoryRepository {
 
    List<Category> findAll(Integer userId) throws EtResourceNotFoundException;
    
    Category findById(Integer userId, Integer categoryId) throws EtResourceNotFoundException;
    
    Integer create(Integer userId, String title, String description) throws EtBadRequestException;
    
    void update(Integer userId, Integer categoryId, Category category) throws EtBadRequestException;
    
    void removeById(Integer userId, Integer categoryId);
    
}
