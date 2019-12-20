package com.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.model.Product;
import com.domain.repository.ProductRepository;

@Service("productService")
public class ProductServiceImpl implements ProductService {

	private ProductRepository productRepository;
	
	@Autowired
	public  ProductServiceImpl(ProductRepository productRepository) {
		System.out.println(" ProductServiceImpl with Constructor Injection :");
		this.productRepository = productRepository;
	}
	
	//@Autowired
	public void setProductRepository(ProductRepository productRepository) {
		System.out.println("ProductServiceImpl with Setter Injection :");
		this.productRepository = productRepository;
	}
	@Override
	public List<Product> getProducts() {
		return productRepository.getProducts();
	}

}
