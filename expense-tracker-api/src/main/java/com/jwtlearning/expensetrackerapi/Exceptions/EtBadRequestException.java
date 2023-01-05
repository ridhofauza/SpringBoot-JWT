/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jwtlearning.expensetrackerapi.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author user
 */
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class EtBadRequestException extends RuntimeException {
    
    public EtBadRequestException(String message) {
        super(message);
    }
    
}
