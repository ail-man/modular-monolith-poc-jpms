package com.example.monolith.jpms.productcatalog.api;

import com.example.monolith.jpms.productcatalog.internal.ProductServiceImpl;

public final class ProductServiceBootstrap {

	private ProductServiceBootstrap() {
	}

	// Factory method for internal usage
	public static ProductService create() {
		return new ProductServiceImpl();
	}
}
