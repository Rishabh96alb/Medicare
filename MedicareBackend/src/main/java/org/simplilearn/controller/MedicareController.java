package org.simplilearn.controller;

import java.util.List;

import org.simplilearn.entity.AdminDetails;
import org.simplilearn.entity.Cart;
import org.simplilearn.entity.OrderResponse;
import org.simplilearn.entity.ProductList;
import org.simplilearn.entity.User;
import org.simplilearn.entity.UserDetails;
import org.simplilearn.service.AdminDetailsService;
import org.simplilearn.service.CartService;
import org.simplilearn.service.ProductListService;
import org.simplilearn.service.UserDetailsService;
import org.simplilearn.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/simplilearn")
public class MedicareController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private ProductListService productListService;
	
	@Autowired
	private CartService cartService;
	
	@Autowired
	private AdminDetailsService adminDetailsService;
	
	@Autowired
	private UserDetailsService userDetailsService;
		
	// User & Product
	
	//1. POST METHOD
	
	@PostMapping("/user")
	public User addUser(@RequestBody User user)
	{
		return userService.saveUser(user);
	}
	
	//2.GET METHOD
	
	@GetMapping("/user")
	public List<User> findAllUsers()
	{
		return userService.getUsers();
	}
	
	@GetMapping("/user/{id}")
	public User findUserById(@PathVariable int id)
	{
		return userService.getUserById(id);
	}
	
	//3. DELETE METHOD
	@DeleteMapping("/user/{id}")
	public String deleteUser(@PathVariable int id)
	{
		return userService.deleteUserById(id);
	}
	
	// Join the User and Product Table
	
	@GetMapping("/order/list")
	public List<OrderResponse> findAllUserProductInfos()
	{
		return userService.getUserProductJoinInfos();
	}
	
	// Product List
	
	//1. POST METHOD
	
	@PostMapping("/product/list")
	public ProductList addProductList(@RequestBody ProductList productlist)
	{
		return productListService.saveProductList(productlist);
	}
	
	//2. GET METHOD
	
	@GetMapping("/product/list")
	public List<ProductList> findAllProductLists()
	{
		return productListService.getProductLists();
	}
	
	@GetMapping("/product/list/{id}")
	public ProductList findProductListById(@PathVariable int id)
	{
		return productListService.getProductListById(id);
	}
	
	//3. DELETE METHOD
	
	@DeleteMapping("/product/list/{id}")
	public String deleteProductList(@PathVariable int id)
	{
		return productListService.deleteProductListById(id);
	}
	
	//4. PUT METHOD
	
	@PutMapping("/product/list/{id}")
	public ProductList updateProductList(@RequestBody ProductList productlist, @PathVariable int id)
	{
		return productListService.updateProductList(productlist, id);
	}
	
	//CART
	
	//1. POST METHOD
	
	@PostMapping("/cart")
	public Cart addCart(@RequestBody Cart cart)
	{
		return cartService.saveCart(cart);
	}
	
	//2. GET METHOD
	
	@GetMapping("/cart")
	public List<Cart> findAllCarts()
	{
		return cartService.getCarts();
	}
	
	@GetMapping("/cart/{id}")
	public Cart findCartById(@PathVariable int id)
	{
		return cartService.getCartById(id);
	}
	
	//3. DELETE METHOD
	
	@DeleteMapping("/cart/{id}")
	public String deleteCart(@PathVariable int id)
	{
		return cartService.deleteCartById(id);
	}
	
	//User Details
	
	
	//1. POST METHOD
	
	@PostMapping("/user/details")
	public UserDetails addUserDetails(@RequestBody UserDetails userdetails)
	{
		return userDetailsService.saveUserDetails(userdetails);
	}
	
	//2. GET METHOD
	
	@GetMapping("/user/details")
	public List<UserDetails> findAllUserDetails()
	{
		return userDetailsService.getUserDetails();
	}
	
	@GetMapping("/user/details{id}")
	public UserDetails findUserDetailsById(@PathVariable int id)
	{
		return userDetailsService.getUserDetailsById(id);
	}
	
	//3. PUT METHOD
	
	@PutMapping("/user/details/{id}")
	public UserDetails updateUserDetails(@RequestBody UserDetails userdetails,@PathVariable int id)
	{
		return userDetailsService.updateUserDetails(userdetails, id);
	}
	
	// Admin Details
	
	//1. POST METHOD
	
	@PostMapping("/admin/details")
	public AdminDetails addAdminDetails(@RequestBody AdminDetails admindetails)
	{
		return adminDetailsService.saveAdminDetails(admindetails);
	}
	
	//2. GET METHOD
	
	@GetMapping("/admin/details")
	public List<AdminDetails> findAllAdminDetails()
	{
		return adminDetailsService.getAdminDetails();
	}
	
	@GetMapping("/admin/details/{id}")
	public AdminDetails findAdminDetailsById(@PathVariable int id)
	{
		return adminDetailsService.getAdminDetailsById(id);
	}
	
	//3. PUT METHOD
	
	@PutMapping("/admin/details/{id}")
	public AdminDetails updateAdminDetails(@RequestBody AdminDetails admindetails,@PathVariable int id)
	{
		return adminDetailsService.updateAdminDetails(admindetails, id);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
