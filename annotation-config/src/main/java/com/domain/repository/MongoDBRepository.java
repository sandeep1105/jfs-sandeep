package com.domain.repository;

import java.util.ArrayList;
import java.util.List;

import com.domain.model.Product;

public class MongoDBRepository implements ProductRepository{

	@Override
	public List<Product> getProducts() {
		List<Product> productsvalue = new ArrayList<Product>();
		Product technical = new Product();
		technical.setProductId("01");
		technical.setProductName("Value1");
		productsvalue.add(technical);
		technical = new Product();
		technical.setProductId("02");
		technical.setProductName("Value 2");
		return productsvalue;
	}

}
