package com.moveon.rental.repositories;

import java.util.List;

import com.moveon.rental.model.Order;

public interface OrderRepository{
	
	public void insert(Order order);
	
	public List<Order> findByMobileNumber(long mobile);

}
