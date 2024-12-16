package com.example.monolith.jpms.app;

import com.example.monolith.jpms.orderprocessing.api.Order;
import com.example.monolith.jpms.orderprocessing.api.OrderServiceFactory;
import com.example.monolith.jpms.productcatalog.api.ProductServiceFactory;
import com.example.monolith.jpms.usermanagement.api.UserServiceFactory;

public class Main {

	public static void main(String[] args) {
		var userService = UserServiceFactory.create();
		var productService = ProductServiceFactory.create();
		var orderService = OrderServiceFactory.create(userService, productService);

		var order = new Order("o123", "u1", "p1");
		orderService.processOrder(order);
	}
}