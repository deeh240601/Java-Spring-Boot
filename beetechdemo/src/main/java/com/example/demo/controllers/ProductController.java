package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Product;
import com.example.demo.service.IProductService;

@RestController
@RequestMapping(path= "/spring")

public class ProductController {
	@Autowired
	private IProductService productService;
	
	@GetMapping("/")
	public List<Product> getAll(){
		return productService.getAll();

	}
	
	@PostMapping("/create")
	public Product add(@RequestBody Product product) {
		return productService.add(product);
	}
	
	@DeleteMapping("/delete/{id}")
	public boolean delete(@PathVariable("id") long id) {
		return productService.delete(id);
	}
	
	@PutMapping("/updatwe/{id}]")
	public Product delete(@RequestParam("id") long id, @RequestBody Product product) {
		return productService.update(id, product);
	}
	
}