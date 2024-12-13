package com.example.usermanagement.api;

import lombok.Builder;

@Builder(toBuilder = true)
public record User(String id, String name) {
}
