/*package com.cognizant.springlearn.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.springlearn.Country;
import com.cognizant.springlearn.service.exception.CountryNotFoundException;

public class CountryService {

	private List<Country> countries = new ArrayList<>();
	
	public CountryService() {
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		countries = context.getBean("countryList", ArrayList.class);
	}
	public String getCountry(String code) {
		
		
		String countryName = countries(code.toUpperCase())
		/*for(String country : countries) {
			if(country.getClass().equals(code)){//equalsIgnoreCase(code)) {
				return country;
			}
		}
		throw new CountryNotFoundException();
	}
}*/
