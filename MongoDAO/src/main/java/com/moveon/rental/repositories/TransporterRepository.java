package com.moveon.rental.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.moveon.rental.model.Transporter;

public interface TransporterRepository extends MongoRepository<Transporter, String> {
	
	@Query("{transporterName:?0}")
	public Transporter findbyTransporterName(String transporterName);
	
	

}
