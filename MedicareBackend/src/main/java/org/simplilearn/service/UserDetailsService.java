package org.simplilearn.service;

import java.util.List;

import org.simplilearn.entity.UserDetails;
import org.simplilearn.repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsService {

	@Autowired
	private UserDetailsRepository userDetRepo;
	
	//POST METHOD
	
	public UserDetails saveUserDetails(UserDetails userdetails) {
		
		return userDetRepo.save(userdetails); 
	}
	
	//GET METHOD
	
	public List<UserDetails> getUserDetails()
	{
		return userDetRepo.findAll();
	}
	
	public UserDetails getUserDetailsById(int id)
	{
		return userDetRepo.findById(id).orElse(null);
	}
	
	//PUT METHOD
	
	public UserDetails updateUserDetails(UserDetails userdetails, int id)
	{
		UserDetails existingUserDetails = userDetRepo.findById(id).orElse(null);
		existingUserDetails.setUsername(userdetails.getUsername());
		existingUserDetails.setPassword(userdetails.getPassword());
		return userDetRepo.save(existingUserDetails);
		
	}

//	public List<UserDetails> getUserDetails() {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
	
	
	
	
}
