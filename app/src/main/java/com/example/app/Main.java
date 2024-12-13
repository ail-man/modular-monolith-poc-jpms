package com.example.app;

import com.example.orderprocessing.api.Order;
import com.example.orderprocessing.api.OrderingServiceBootstrap;
import com.example.productcatalog.api.ProductServiceBootstrap;
import com.example.usermanagement.api.UserServiceBootstrap;

// Note: In a strict scenario, we should not access internal classes directly. 
// However, for demonstration purposes, we'll do it here to wire things up.
// In real scenarios, you'd use a service locator or dependency injection framework that 
// is internal to the module boundaries. Another approach is separating API and Impl modules.
//
// If you want to be strict, consider creating a separate "bootstrap" class within each module 
// that returns an API type without exposing internals.

public class Main {

	public static void main(String[] args) {
		var userService = UserServiceBootstrap.create();
		var productService = ProductServiceBootstrap.create();
		var orderService = OrderingServiceBootstrap.create(userService, productService);

		var order = new Order("o123", "u1", "p1");
		orderService.processOrder(order);
	}
}