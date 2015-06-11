package com.moveon.rental.repositories;

import org.springframework.data.mongodb.repository.Query;

import com.moveon.rental.model.Transporter;

public interface TransporterRepository {
	
	@Query("{transporterName:?0}")
	public Transporter findbyTransporterName(String transporterName);
	
	

}
