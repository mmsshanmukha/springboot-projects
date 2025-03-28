package Springboot.SApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import Springboot.SApp.model.Product;
import Springboot.SApp.service.ProductService;
@RestController
public class ProductController {
	@Autowired
	ProductService service;
	@GetMapping("/products")
	public List<Product> getDetails() {
		return service.getProducts();
	}
	@GetMapping("/products/{prodId}")
	public Product getProductById(@PathVariable int prodId) {
		return service.getProductById(prodId);
	}
	@PostMapping("/products")
	public void addProduct(@RequestBody Product prod) {
		service.addProduct(prod);
	}
	@PutMapping("/products")
	public void updateProduct(@RequestBody Product prod) {
		System.out.println("Vachesaa");
		service.updateProduct(prod);
	}
	@DeleteMapping("/products/{prodId}")
	public void deleteProduct(@PathVariable int prodId) {
		service.deleteProduct(prodId);
	}
}
