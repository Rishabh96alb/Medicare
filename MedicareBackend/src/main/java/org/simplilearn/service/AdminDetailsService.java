package org.simplilearn.service;

import java.util.List;

import org.simplilearn.entity.AdminDetails;
import org.simplilearn.repository.AdminDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminDetailsService {

	@Autowired
	private AdminDetailsRepository adminDetRepo;
	
	//POST METHOD
	
	public AdminDetails saveAdminDetails(AdminDetails admindetails)
	{
		return adminDetRepo.save(admindetails);
	}
	
	//GET METHOD
	
	public List<AdminDetails> getAdminDetails()
	{
		return adminDetRepo.findAll();
	}
	
	public AdminDetails getAdminDetailsById(int id) {
		return adminDetRepo.findById(id).orElse(null);
	}
	
	//PUT METHOD
	
	public AdminDetails updateAdminDetails(AdminDetails admindetails, int id) {
		
		AdminDetails existingAdminDetails = adminDetRepo.findById(id).orElse(null);
		existingAdminDetails.setUsername(admindetails.getUsername());
		existingAdminDetails.setPassword(admindetails.getPassword());
		return adminDetRepo.save(existingAdminDetails);
	}
	
}
