package com.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.model.ProductValue;
import com.domain.repository.ProductRepository;


public class ProductServiceImpl implements ProductService {

	
	private ProductRepository productRepository;
	
	public  ProductServiceImpl(ProductRepository productRepository) {
		System.out.println("Constructor Injection : ProductServiceImpl");
		this.productRepository = productRepository;
	}
	
	public void setProductRepository(ProductRepository productRepository) {
		System.out.println("Setter Injection : ProductServiceImpl");
		this.productRepository = productRepository;
	}
	@Override
	public List<ProductValue> getProducts() {
		return productRepository.getProducts();
	}

}
