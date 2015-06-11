package com.moveon.rental.repositories;

import javax.inject.Inject;

import org.springframework.data.mongodb.core.MongoTemplate;


public abstract class BaseMongoRepository  {

	protected @Inject MongoTemplate mongoTemplate;


	
}
