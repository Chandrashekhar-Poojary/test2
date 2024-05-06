package com.cognizant.springlearn.controller;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearn.Country;
import com.cognizant.springlearn.SpringLearnApplication;
//import com.cognizant.springlearn.service.CountryService;

@RestController

public class CountryController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);
	
	@Autowired
	//private CountryService countryService;
	
	@RequestMapping("/country")
	public Country getCountryIndia() {

		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		Country country = (Country) context.getBean("country"); // using casting
		
		//System.out.println("Country : "+ country.toString());
		return country;
		
	}

	@GetMapping("/countries")
	public ArrayList getAllCountries() {
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		ArrayList countryList = context.getBean("countryList", ArrayList.class); //using Class.RequiredType
		
		//System.out.println("Country List: "+countryList.toString());
		
		return countryList;
	}
	
	/*@GetMapping("/countries/{code}")
	public Country getCountry(@PathVariable String code) {
		
		return countryService.getCountry(code);
	}*/
	
	
	/*6th Handson
	
	@PostMapping(value="/countries")
	public Country addCountry(@RequestBody Country country) {
		//LOGGER.info("START");
		System.out.println(country);
		return country;
		
	}*/
}
