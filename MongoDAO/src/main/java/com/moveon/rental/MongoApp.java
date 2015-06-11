package com.moveon.rental;

import javax.inject.Inject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.moveon.rental.model.Order;
import com.moveon.rental.repositories.OrderRepository;

@Component
public class MongoApp {
	
	private @Inject OrderRepository orderRepo;
	
	
	
	/*public void setMongoTemplate(MongoOperations mongo) {
		this.mongoTemplate = mongo;
	}
*/	
	public static void main(String[] args)  {
		
		
		ApplicationContext context = new  ClassPathXmlApplicationContext("META-INF/spring/app-context.xml");
		MongoApp app = context.getBean(MongoApp.class);
		
		app.perfomrOperation();
	}
	
	void perfomrOperation(){
		
		Order order = new Order();
		order.setEmailId("xzy@abc.com");
		order.setPhoneNumber(9876547872L);
		orderRepo.insert(order);
		
		
	}
	
	
}
