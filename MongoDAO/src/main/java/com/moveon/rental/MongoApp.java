package com.moveon.rental;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Component;

import com.moveon.rental.model.Address;
import com.moveon.rental.model.CITY;
import com.moveon.rental.model.COUNTRY;
import com.moveon.rental.model.STATE;
import com.moveon.rental.model.Transporter;
import com.moveon.rental.repositories.TransporterRepository;

@Component
public class MongoApp {
	
	private @Autowired MongoOperations mongoTemplate;
	
	private @Autowired TransporterRepository tranporterRepo;
	
	
	public void setMongoTemplate(MongoOperations mongo) {
		this.mongoTemplate = mongo;
	}

	public static void main(String[] args)  {
		
		
		ApplicationContext context = new  ClassPathXmlApplicationContext("META-INF/spring/app-context.xml");
		MongoApp app = context.getBean(MongoApp.class);
		app.perfomrOperation();
	}
	
	void perfomrOperation(){
		
		
		Transporter t = new Transporter();
		Address add = new Address();
		add.setAddressLine1("2 456 asdasd 8th main");
		add.setCity(CITY.PUNE);
		add.setState(STATE.MAHARASHTRA);
		add.setCountry(COUNTRY.IN);
		add.setZipCode(String.valueOf(123455));
		t.setAddress(add);
		t.setEmailId("abc2@xyz.com");
		t.setPhoneNumbers(new long[]{1234567890});
		t.setTransporterName("Bajrangi bhai2");
		mongoTemplate.insert(t);
		System.out.println(tranporterRepo.findbyTransporterName("Bajrangi bhai2"));
		mongoTemplate.remove(t);
	}
	
	
}
