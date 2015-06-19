package com.moveon.rental.repositories;

import javax.inject.Inject;

import org.springframework.data.mongodb.core.MongoTemplate;

import com.moveon.rental.model.BaseModel;


public abstract class BaseMongoRepository  {

	protected @Inject MongoTemplate mongoTemplate;

	public void insert(BaseModel model){
		mongoTemplate.save(model);
	}

	
}
