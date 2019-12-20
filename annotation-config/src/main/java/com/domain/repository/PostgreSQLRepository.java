package com.domain.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.domain.model.Product;

@Repository("productRepository")
public class PostgreSQLRepository implements ProductRepository{

	@Override
	public List<Product> getProducts() {
		List<Product> productslist = new ArrayList<Product>();
		Product tech = new Product();
		tech.setProductId("01");
		tech.setProductName("Value1");
		productslist.add(tech);
		tech = new Product();
		tech.setProductId("02");
		tech.setProductName("Value2");
		return productslist;
	}

}
