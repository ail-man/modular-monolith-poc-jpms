package com.example.monolith.jpms.orderprocessing.api;

import com.example.monolith.jpms.orderprocessing.internal.OrderServiceImpl;
import com.example.monolith.jpms.productcatalog.api.ProductService;
import com.example.monolith.jpms.usermanagement.api.UserService;

public final class OrderServiceFactory {

	private OrderServiceFactory() {
	}

	// Factory method for internal usage
	public static OrderService create(final UserService userService, final ProductService productService) {
		return new OrderServiceImpl(userService, productService);
	}
}
