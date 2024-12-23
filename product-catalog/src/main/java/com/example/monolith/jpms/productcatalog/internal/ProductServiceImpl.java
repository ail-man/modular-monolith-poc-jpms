package com.example.monolith.jpms.productcatalog.internal;

import java.util.List;

import com.example.monolith.jpms.productcatalog.api.Product;
import com.example.monolith.jpms.productcatalog.api.ProductService;

public class ProductServiceImpl implements ProductService {

	@Override
	public List<Product> listAllProducts() {
		return List.of(
			new Product("p1", "Laptop", 1200.0),
			new Product("p2", "Smartphone", 799.0)
		);
	}

}