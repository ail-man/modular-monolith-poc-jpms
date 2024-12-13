package com.example.productcatalog.api;

import com.example.productcatalog.internal.ProductServiceImpl;

public final class ProductServiceBootstrap {

	private ProductServiceBootstrap() {
	}

	// Factory method for internal usage
	public static ProductService create() {
		return new ProductServiceImpl();
	}
}
