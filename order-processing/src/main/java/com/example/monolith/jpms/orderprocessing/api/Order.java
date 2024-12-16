package com.example.monolith.jpms.orderprocessing.api;

public record Order(String orderId, String userId, String productId) {
}
