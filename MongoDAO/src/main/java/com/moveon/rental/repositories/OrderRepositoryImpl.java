package com.moveon.rental.repositories;

import java.util.List;

import org.springframework.data.mongodb.core.query.Query;
import static org.springframework.data.mongodb.core.query.Criteria.where;

import com.moveon.rental.model.Order;


public class OrderRepositoryImpl extends BaseMongoRepository implements OrderRepository{

	
	public List<Order> findByMobileNumber(long mobile){
		
		return mongoTemplate.find(new Query(where("phoneNumber").is(mobile)), Order.class);
	}

	public void insert(Order order) {
		
		mongoTemplate.save(order);
	}

	
}
