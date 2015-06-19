package com.moveon.rental;

import javax.inject.Inject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.moveon.rental.model.Address;
import com.moveon.rental.model.CITY;
import com.moveon.rental.model.COUNTRY;
import com.moveon.rental.model.STATE;
import com.moveon.rental.model.Transporter;
import com.moveon.rental.repositories.OrderRepository;
import com.moveon.rental.repositories.TransporterRepository;

@Component
public class MongoApp {
	
	private @Inject OrderRepository orderRepo;
	
	private @Inject TransporterRepository trasnporterRepo;
	
	
	
	
	public static void main(String[] args)  {
		
		
		ApplicationContext context = new  ClassPathXmlApplicationContext("META-INF/spring/app-context.xml");
		MongoApp app = context.getBean(MongoApp.class);
		
		app.perfomrOperation();
	}
	
	void perfomrOperation(){
		
		/*Transporter t = new Transporter();
		Address add = new Address();
		add.setAddressLine1("line 1 bellandur");
		add.setAddressLine2("line 2");
		add.setCity(CITY.PUNE);
		add.setState(STATE.MAHARASHTRA);
		add.setCountry(COUNTRY.IN);
		add.setZipCode("23123");
		add.setLongLat(new double[]{77.6681,12.9351});
		
		t.setAddress(add);
		t.setEmailId("pqr@gmail.com");
		t.setPhoneNumbers(new long[]{213234,2134234});
		t.setTransporterName("ust Trans");
		trasnporterRepo.insert(t);*/
		
		System.out.println(trasnporterRepo.findallnear(new double[]{77.7500,12.9700},10000));
		
	}
	
	
}
