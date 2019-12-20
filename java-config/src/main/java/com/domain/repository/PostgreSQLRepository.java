package com.domain.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.domain.model.ProductValue;


public class PostgreSQLRepository implements ProductRepository{

	@Override
	public List<ProductValue> getProducts() {
		List<ProductValue> products = new ArrayList<ProductValue>();
		ProductValue technical = new ProductValue();
		technical.setProductId("01");
		technical.setProductName("Value1");
		products.add(technical);
		technical = new ProductValue();
		technical.setProductId("02");
		technical.setProductName("Value2");
		return products;
	}

}
