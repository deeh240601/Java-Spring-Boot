package com.example.demo.service;

import java.util.List;

import com.example.demo.models.Product;
import com.example.demo.models.User;

public interface UserService {
    // Ham them 
    public User add(User user);

    // Ham chinh sua
    public User update(long userId, User user);

    // Ham xoa 
    public boolean delete(long userId);

    // Ham lay het
    public List<User> getAll();

    // Ham lay ra 1 
    public User getOne(long userId);
    
    // Ham lay sp
    public List<Product> getProductbyUser(long userId);
}
