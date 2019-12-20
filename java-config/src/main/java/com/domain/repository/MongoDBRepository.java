package com.domain.repository;

import java.util.ArrayList;
import java.util.List;

import com.domain.model.ProductValue;

public class MongoDBRepository implements ProductRepository{

	@Override
	public List<ProductValue> getProducts() {
		List<ProductValue> productsvalue = new ArrayList<ProductValue>();
		ProductValue technical = new ProductValue();
		technical.setProductId("01");
		technical.setProductName("Spring");
		productsvalue.add(technical);
		technical = new ProductValue();
		technical.setProductId("02");
		technical.setProductName("Hibernate");
		return productsvalue;
	}

}
