package com.LoginRegister.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LoginRegister.entity.Users;
import com.LoginRegister.repository.UsersRepo;
import com.LoginRegister.requests.LoginRequest;

@Service
public class UserService {
	
	@Autowired
	UsersRepo usersRepo;
	
	
	public Users addUser(Users user) {
		
		return usersRepo.save(user);
	}

	public Boolean loginUser(LoginRequest loginRequest) {
		Optional<Users> user = usersRepo.findById(loginRequest.getUserId());
		
		if(user == null) {
			return false;
		}
		
		Users user1 = user.get();
		
		if(!user1.getPassword().equals(loginRequest.getPassword())) {
			return false;
		}
		
		return true;
	}
}
