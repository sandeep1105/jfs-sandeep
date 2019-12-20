package com.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.domain.model.Product;
import com.domain.service.ProductService;
import com.domain.service.ProductServiceImpl;

public class Application {
	public static void main(String[] args) {
		standardCode();
	
	}

	private static void standardCode() {
			ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
			ProductService productService = applicationContext.getBean("productService",ProductService.class);
		    List<Product> products = productService.getProducts();
		    products.forEach(System.out::println);
	}

	/*
	 * public static void compactCode() { new
	 * ClassPathXmlApplicationContext("applicationContext.xml")
	 * .getBean("productService", ProductService.class).getProducts()
	 * .forEach(System.out::println); }
	 */
}
