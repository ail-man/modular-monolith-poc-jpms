package com.example.usermanagement.api;

import com.example.usermanagement.internal.UserServiceImpl;

public final class UserServiceBootstrap {

	private UserServiceBootstrap() {
	}

	// Factory method for internal usage
	public static UserService create() {
		return new UserServiceImpl();
	}
}
