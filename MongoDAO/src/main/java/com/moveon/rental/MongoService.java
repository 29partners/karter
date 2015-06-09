package com.moveon.rental;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import com.mongodb.Mongo;
import com.moveon.rental.model.BaseModel;


@Component
public class MongoService implements Service {
	
	private @Autowired Mongo mongo;
	

	public void insert(BaseModel model) {
		MongoOperations mongoOps = new MongoTemplate(mongo, "transportersdb");
		mongoOps.insert(model);
		
	}

	public void remove(BaseModel model) {
		MongoOperations mongoOps = new MongoTemplate(mongo, "transportersdb");
		mongoOps.remove(model);
		
	}

	public void update(BaseModel model) {
		
		
	}

	public BaseModel findOne(Query query, Class<? extends BaseModel> modelType) {
		
		MongoOperations mongoOps = new MongoTemplate(mongo, "transportersdb");
		return mongoOps.findOne(query, modelType);
		
	}

	public List<BaseModel> findAll(Query query,
			Class<? extends BaseModel> modelType) {
		MongoOperations mongoOps = new MongoTemplate(mongo, "transportersdb");
		return (List<BaseModel>) mongoOps.find(query, modelType);
	}

}
