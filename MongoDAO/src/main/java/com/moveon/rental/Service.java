package com.moveon.rental;

import java.util.List;

import org.springframework.data.mongodb.core.query.Query;

import com.moveon.rental.model.BaseModel;

public interface Service {
	
	void insert(BaseModel model);
	
	void remove(BaseModel model);
	
	void update(BaseModel model);
	
	BaseModel findOne(Query query, Class<? extends BaseModel> modelType);
	
	List<BaseModel> findAll(Query query, Class<? extends BaseModel> modelType);
	
	
}
