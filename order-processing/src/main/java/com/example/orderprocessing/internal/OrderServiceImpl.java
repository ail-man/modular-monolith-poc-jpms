package com.example.orderprocessing.internal;

import com.example.orderprocessing.api.Order;
import com.example.orderprocessing.api.OrderService;
import com.example.productcatalog.api.ProductService;
import com.example.usermanagement.api.UserService;

public class OrderServiceImpl implements OrderService {

	private final UserService userService;
	private final ProductService productService;

	public OrderServiceImpl(UserService userService, ProductService productService) {
		this.userService = userService;
		this.productService = productService;
	}

	@Override
	public void processOrder(Order order) {
		var user = userService.getUserById(order.userId());
		var products = productService.listAllProducts();
		var product = products.stream().filter(p -> p.id().equals(order.productId())).findFirst();
		if (product.isPresent()) {
			System.out.println("Processing order " + order.orderId() + " for user " + user.name() + " -> Product: " + product.get().name());
		} else {
			System.out.println("Product not found for order " + order.orderId());
		}
	}

	public static OrderService create(UserService userService, ProductService productService) {
		return new OrderServiceImpl(userService, productService);
	}
}