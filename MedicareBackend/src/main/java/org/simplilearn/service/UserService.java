package org.simplilearn.service;

import java.util.List;

import org.simplilearn.entity.OrderResponse;
import org.simplilearn.entity.User;
import org.simplilearn.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
@Autowired
	private UserRepository userRepo;
	
	// Save the User to the database(POST METHOD)
	public User saveUser(User user)
	{
		return userRepo.save(user);
	}
	
	//Fetch the User from Database(GET METHOD)
	
	public List<User> getUsers(){
		return userRepo.findAll();
	}
	
	public User getUserById(int id) {
		return userRepo.findById(id).orElse(null);
	}
	
	//Delete the User from Database (DELETE METHOD)
	
	public String deleteUserById(int id) {
		userRepo.deleteById(id);
		return "Data" +id+  "Deleted Successfully!";
	}
	
	//Join the User and Product Table
	
	public List<OrderResponse> getUserProductJoinInfos(){
		return userRepo.joinUserProductTable();
	}	
	
}
