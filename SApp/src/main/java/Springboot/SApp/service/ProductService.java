package Springboot.SApp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import Springboot.SApp.model.Product;
import Springboot.SApp.repository.ProductRepo;
@Service
public class ProductService {
	@Autowired
	ProductRepo repo;
	//List<Product> products=new ArrayList<>(Arrays.asList(new Product(1,"iphone",50000),new Product(2,"samsung",70000),new Product(3,"OnePlus",40000)));
	public List<Product> getProducts(){
		return repo.findAll();
	}
	public Product getProductById(int prodId) {
		return repo.findById(prodId).orElse(new Product());
	}
	public void addProduct(Product prod) {
		//System.out.println(prod);
		repo.save(prod);
	}
	@PutMapping("/products")
	public void updateProduct(Product prod) {
		repo.save(prod);
	}
	public void deleteProduct(int prodId) {
		repo.deleteById(prodId);
	}
}