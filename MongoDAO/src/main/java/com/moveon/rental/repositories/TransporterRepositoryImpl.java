package com.moveon.rental.repositories;

import java.util.List;

import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.moveon.rental.model.Transporter;

public class TransporterRepositoryImpl extends BaseMongoRepository implements
		TransporterRepository {

	public Transporter findbyTransporterName(String transporterName) {

		return null;
	}

	public void insert(Transporter transporter) {
		mongoTemplate.save(transporter);
	}
	

	public List<Transporter> findallnear(double[] longLat, int maxDistance) {
		//db.transporter.find({"address.longLat":{$near:{$geometry:{type:"Point",coordinates:[longitude,latitude]},$maxDistance:10000}}})
		Point p = new Point(longLat[0],longLat[1]);
		Criteria criteria = new Criteria("address.longLat");
		criteria.near(p);
		criteria.maxDistance(maxDistance);
		List<Transporter> result =  mongoTemplate.findAllAndRemove(new Query(criteria), Transporter.class);
		return result;
	}

	
}
