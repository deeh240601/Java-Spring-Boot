package com.example.demo.service;

import java.util.List;

import com.example.demo.models.Product;

public interface IProductService {
    // Ham them 
    public Product add(Product Product);

    // Ham chinh sua
    public Product update(long id, Product product);

    // Ham xoa 
    public boolean delete(long id);

    // Ham lay het
    public List<Product> getAll();

    // Ham lay ra 1 
    public Product getOne(long id);
}
