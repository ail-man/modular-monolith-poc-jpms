package com.example.monolith.jpms.usermanagement.internal;

import com.example.monolith.jpms.usermanagement.api.User;
import com.example.monolith.jpms.usermanagement.api.UserService;

// Not exported, so only accessible within this module.
public class UserServiceImpl implements UserService {

	@Override
	public User getUserById(String userId) {
		// In a real app, fetch from DB or external source
		return new User(userId, "Alice");
	}

}