package com.moveon.rental.repositories;

import java.util.List;

import com.moveon.rental.model.Transporter;

public interface TransporterRepository {
	
	public Transporter findbyTransporterName(String transporterName);
	
	public List<Transporter> findallnear(double[] latlong,int maxDistance);
	
	public void insert(Transporter order);
	

}
