/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jwtlearning.expensetrackerapi.repositories;

import com.jwtlearning.expensetrackerapi.Exceptions.EtAuthException;
import com.jwtlearning.expensetrackerapi.dto.User;

/**
 *
 * @author user
 */
public interface UserRepository {
    
    Integer create(String firstName, String lastName, String email, String password) throws EtAuthException;
    
    User findByEmailAndPassword(String email, String password) throws EtAuthException;
    
    Integer getCountByEmail(String email);
    
    User findById(Integer userId);
    
}
