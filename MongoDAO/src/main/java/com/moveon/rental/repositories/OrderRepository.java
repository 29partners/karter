package com.moveon.rental.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.moveon.rental.model.Order;

public interface OrderRepository extends MongoRepository<Order, String>{

}
