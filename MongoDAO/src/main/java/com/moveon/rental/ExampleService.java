package com.moveon.rental;

import java.util.List;

import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import com.moveon.rental.model.BaseModel;


/**
 * {@link Service} with hard-coded input data.
 */
@Component
public class ExampleService implements Service {
	
	/**
	 * Reads next record from input
	 */
	public String getMessage() {
		return "Hello world!";	
	}

	public void insert(BaseModel model) {
		// TODO Auto-generated method stub
		
	}

	public void remove(BaseModel model) {
		// TODO Auto-generated method stub
		
	}

	public void update(BaseModel model) {
		// TODO Auto-generated method stub
		
	}

	public BaseModel findOne(Query query, Class<? extends BaseModel> modelType) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<BaseModel> findAll(Query query,
			Class<? extends BaseModel> modelType) {
		// TODO Auto-generated method stub
		return null;
	}

}
