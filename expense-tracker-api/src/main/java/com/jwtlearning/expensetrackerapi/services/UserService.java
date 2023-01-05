/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jwtlearning.expensetrackerapi.services;

import com.jwtlearning.expensetrackerapi.Exceptions.EtAuthException;
import com.jwtlearning.expensetrackerapi.dto.User;

/**
 *
 * @author user
 */
public interface UserService {
    
    User validateUser(String email, String password) throws EtAuthException;
    
    User registerUser(String firstName, String lastName, String email, String password) throws EtAuthException;
    
}
