package com.moveon.app;

import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.moveon.rental.model.Order;
import com.moveon.rental.repositories.OrderRepository;


@Controller
public class RentalController {
	
	private static final Logger logger = LoggerFactory.getLogger(RentalController.class);
	
	@Inject OrderRepository order;
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home(Locale locale, Model model) {
		
				
		return new ModelAndView("index");
	}

	
	@RequestMapping(value= "/order",method = {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView placeOrder(@ModelAttribute Order model) {
		order.insert(model);
		return new ModelAndView("search");
	}
	
	
	
	
}
