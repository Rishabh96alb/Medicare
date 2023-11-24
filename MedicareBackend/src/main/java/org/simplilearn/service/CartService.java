package org.simplilearn.service;

import java.util.List;

import org.simplilearn.entity.Cart;
import org.simplilearn.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {

	@Autowired
	private CartRepository cartRepo;
	
	//Save the Cart data to Database(POST METHOD)
	
	public Cart saveCart(Cart cart) {
		return cartRepo.save(cart); 
		
	}
	
	//Get the cart from Database(GET METHOD)
	
	public List<Cart> getCarts(){
		return cartRepo.findAll();
	}
	
	public Cart getCartById(int id) {
		return cartRepo.findById(id).orElse(null);
	}
	
	//Delete the cart from Database(DELETE METHOD)

	public String deleteCartById(int id) {
		cartRepo.deleteById(id);
		return "Data" +id+ "Deleted Successfully!";
	}
	
	
	
}
