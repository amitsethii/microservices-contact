package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;

@Service
public class UserServiceimpl implements UserService {

	
	//fake user list
	List<User>list = List.of(
	new User(121L, "Amit Sethi","12345"),
	new User(122L, "bharat gupta","67890"),
	new User(123L, "Chirag shah","01928"),
	new User(124L, "Deepak mittal","29374")
			);
			
	
	
	@Override
	public User getUser(long id) {
		// TODO Auto-generated method stub
		return this.list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
	}

}
