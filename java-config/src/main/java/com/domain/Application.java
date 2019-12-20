package com.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.domain.model.ProductValue;
import com.domain.service.ProductService;
import com.domain.service.ProductServiceImpl;

public class Application {
	public static void main(String[] args) {
		doubleCode();
		
	}

	private static void doubleCode() {
				ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
				ProductService productService = applicationContext.getBean("productService",
				ProductService.class);
		List<ProductValue> products = productService.getProducts();


		products.forEach(System.out::println);
	}

}
