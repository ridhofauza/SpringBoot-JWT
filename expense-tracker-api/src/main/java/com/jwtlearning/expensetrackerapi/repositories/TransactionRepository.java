/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jwtlearning.expensetrackerapi.repositories;

import com.jwtlearning.expensetrackerapi.Exceptions.EtBadRequestException;
import com.jwtlearning.expensetrackerapi.Exceptions.EtResourceNotFoundException;
import com.jwtlearning.expensetrackerapi.dto.Transaction;
import java.util.List;

/**
 *
 * @author user
 */
public interface TransactionRepository {
   List<Transaction> findAll(Integer userId, Integer categoryId);
   
   Transaction findById(Integer userId, Integer categoryId, Integer transactionId) throws EtResourceNotFoundException;
   
   Integer create(Integer userId, Integer categoryId, Double amount, String note, Long transactionDate) throws EtBadRequestException;
   
   void update(Integer userId, Integer categoryId, Integer transactionId, Transaction transaction) throws EtBadRequestException;
   
   void removeById(Integer userId, Integer categoryId, Integer transaction) throws EtResourceNotFoundException;
}
