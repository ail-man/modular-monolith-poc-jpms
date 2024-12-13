package com.example.orderprocessing.api;

import com.example.orderprocessing.internal.OrderServiceImpl;
import com.example.productcatalog.api.ProductService;
import com.example.usermanagement.api.UserService;

public final class OrderingServiceBootstrap {

	private OrderingServiceBootstrap() {
	}

	// Factory method for internal usage
	public static OrderService create(final UserService userService, final ProductService productService) {
		return new OrderServiceImpl(userService, productService);
	}
}
