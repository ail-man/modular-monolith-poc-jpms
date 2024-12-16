package com.example.monolith.jpms.productcatalog.api;

import com.example.monolith.jpms.productcatalog.internal.ProductServiceImpl;

public final class ProductServiceFactory {

	private ProductServiceFactory() {
	}

	// Factory method for internal usage
	public static ProductService create() {
		return new ProductServiceImpl();
	}
}
