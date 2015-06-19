package com.moveon.app;

import java.util.List;
import java.util.Locale;

import javax.inject.Inject;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.moveon.rental.model.Order;
import com.moveon.rental.model.Transporter;
import com.moveon.rental.repositories.OrderRepository;
import com.moveon.rental.repositories.TransporterRepository;


@Controller
public class RentalController {
	
	//private static final Logger logger = LoggerFactory.getLogger(RentalController.class);
	
	@Inject OrderRepository order;
	
	@Inject TransporterRepository transporter;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home(Locale locale, Model model) {
		return new ModelAndView("index");
	}

	
	@RequestMapping(value= "/order",method = {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView placeOrder(@RequestBody  Order model) {
		order.insert(model);
		return new ModelAndView("search");
	}

	
	@RequestMapping(value= "/transporter", method = RequestMethod.POST ,produces = MediaType.TEXT_PLAIN_VALUE)
	@ResponseBody
	public String placeOrder(@RequestBody Transporter model) {
		transporter.insert(model);
		return "success";
	}
	
	
	@RequestMapping(value= "/transporter/{longitude}/{latitude}/{maxdistance}", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<Transporter> findnear(@PathVariable double longitude,@PathVariable double latitude, @PathVariable int maxdistance ) {
		List<Transporter> result = transporter.findallnear(new double[]{longitude,latitude}, maxdistance);
		return result;
	}
	
 }
