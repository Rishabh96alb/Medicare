package org.simplilearn.service;

import java.util.List;

import org.simplilearn.entity.ProductList;
import org.simplilearn.repository.ProductListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductListService {

	@Autowired
	private ProductListRepository productListRepo;
	
	//Save the ProductList to the Database(POST METHOD)
	
	public ProductList saveProductList(ProductList productlist) {
		return productListRepo.save(productlist);
	}
	
	//Get the ProductList from Database(GET METHOD)
	
	public List<ProductList>getProductLists()
	{
		return productListRepo.findAll();
	}
	
	public ProductList getProductListById(int id) {
		return productListRepo.findById(id).orElse(null);
	}
	
	//Delete the ProductList from Database(DELETE METHOD)
	
	public String deleteProductListById(int id)
	{
		productListRepo.deleteById(id);
		return "Data" +id+ "Deleted Successfully!";
	}
	
	//Update the Product List to the Database(PUT METHOD)
	
	public ProductList updateProductList(ProductList productList, int id) {
		
		ProductList existingProductList = productListRepo.findById(id).orElse(null);
		existingProductList.setMedicinename(productList.getMedicinename());
		existingProductList.setPrice(productList.getPrice());
		existingProductList.setSeller(productList.getSeller());
		existingProductList.setQtyDesc(productList.getQtyDesc());
		existingProductList.setImgURL(productList.getImgURL());
		return productListRepo.save(existingProductList);
	}
	
	
	
	
}
