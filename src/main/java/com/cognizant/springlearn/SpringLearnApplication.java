package com.cognizant.springlearn;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.springlearn.bean.AppConfig;
import com.cognizant.springlearn.bean.Employee;
import com.cognizant.springlearn.controller.EmployeeController;

@SpringBootApplication
public class SpringLearnApplication {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);
	
	/*@Autowired
	private EmployeeController employeeController;*/
	
	public static void main(String[] args) {
		SpringApplication.run(SpringLearnApplication.class, args);
		//SpringLearnApplication application = new SpringLearnApplication();
//		application.displayDate();
//		application.displayCountry();
//		application.displayCountries();
		
		//application.displayEmployee();
		
		/* Handson 3
        System.out.println("Started");
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        displayEmployeeControllerAnnotation(applicationContext);
        System.out.println("Success");*/
	}
	
	public void displayDate() {
		LOGGER.info("START");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
		SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);
		
		String date = "31/12/2018";
		
		try {
			
			Date parsedDate = format.parse(date);
			//LOGGER.debug("Parsed date: {}", parsedDate);
			System.out.println("Parsed date: "+ parsedDate);
			
		}catch(Exception e) {
			LOGGER.error("Error parsing date: {}", e.getMessage());
		}
		
		LOGGER.info("END");
	}
	
	
	public void displayCountry() {
		LOGGER.info("START");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		Country country = (Country) context.getBean("country"); // using casting
		
		//LOGGER.debug("Country : {}", country.toString());
		System.out.println("Country : "+ country.toString());
		
		
		LOGGER.info("END");
	}
	
	
	public void displayCountries() {
		LOGGER.info("START");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		ArrayList countryList = context.getBean("countryList", ArrayList.class); //using Class.RequiredType
		
		//LOGGER.debug("Country List: {}", countryList.toString());
		System.out.println("Country List: "+countryList.toString());
		
		
		LOGGER.info("END");
	}
	
	
	public static void displayEmployeeControllerAnnotation(ApplicationContext applicationContext) {
		/*LOGGER.info("START");
		ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
		Employee emp = (Employee) context.getBean("employee"); //using Class.RequiredType
		
		//LOGGER.debug("Country List: {}", countryList.toString());
		System.out.println("Employee Details: "+emp.toString());
		
		LOGGER.info("END");*/
		EmployeeController employeeController = (EmployeeController) applicationContext.getBean("employeeController");
        System.out.println("Loaded EmployeeController bean: " + employeeController);
	}
	

}
