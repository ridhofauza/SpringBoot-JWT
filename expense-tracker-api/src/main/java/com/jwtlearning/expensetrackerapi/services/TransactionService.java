/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jwtlearning.expensetrackerapi.services;

import com.jwtlearning.expensetrackerapi.Exceptions.EtBadRequestException;
import com.jwtlearning.expensetrackerapi.Exceptions.EtResourceNotFoundException;
import com.jwtlearning.expensetrackerapi.dto.Transaction;
import java.util.List;

/**
 *
 * @author user
 */
public interface TransactionService {
    
    List<Transaction> fetchAllTransactions(Integer userId, Integer categoryId);
    
    Transaction fetchTransactionById(Integer userId, Integer categoryId, Integer transactionId) throws EtResourceNotFoundException;
    
    Transaction addTransaction(Integer userId, Integer categoryId, Double amount, String note, Long transactionDate) throws EtBadRequestException;
    
    void updateTransaction(Integer userId, Integer categoryId, Integer transactionId, Transaction transaction) throws EtBadRequestException;
    
    void removeTransaction(Integer userId, Integer categoryId, Integer transactionId) throws EtResourceNotFoundException;
}
