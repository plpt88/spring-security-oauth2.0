package com.restapi.web.repository;

import com.restapi.web.dto.Transaction;
import org.springframework.data.repository.CrudRepository;

public interface TransactionRepository extends CrudRepository<Transaction, Integer> {

}
