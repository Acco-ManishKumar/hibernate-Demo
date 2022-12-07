package com.example.hibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;


public class HibernateDemoApplication {
	private static SessionFactory sessionFactory;



	public static void main(String[] args) {
		//File f = new File("C:\\Users\\manish.k\\Downloads\\hibernateDemo\\hibernateDemo\\src\\main\\resources\\hibernate1.cfg.xml");
		Configuration config = new Configuration();
		config.addAnnotatedClass(employee.class);
		config.configure("hibernate.cfg.xml");
		//ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
		//SessionFactory sessionFactory = config.buildSessionFactory(serviceRegistry);
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session s = sessionFactory.openSession();
		employee e = new employee();
		e.setName("Manish_Jat");
		e.setRole("SDE");
		e.setSalary(65000);
		s.beginTransaction();
		s.save(e);
		s.getTransaction().commit();
		SpringApplication.run(HibernateDemoApplication.class, args);
	}

}
