package com.example.monolith.jpms.usermanagement.api;

import com.example.monolith.jpms.usermanagement.internal.UserServiceImpl;

public final class UserServiceFactory {

	private UserServiceFactory() {
	}

	public static UserService create() {
		return new UserServiceImpl();
	}
}
