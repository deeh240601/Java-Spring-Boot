package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.models.Product;
import com.example.demo.models.User;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.repositories.UserRepository;

public class UserServiceImpl implements UserService{
    @Autowired
    private ProductRepository ProductRepository;
    
    @Autowired
    private UserRepository UserRepository;

    @Override
    public User add(User user) {
        if(user!=null){
            return UserRepository.save(user);
        }
        return null;
    }

	@Override
	public User update(long userId, User user) {
		// TODO Auto-generated method stub
        if(user!=null){
            User usr1=UserRepository.getById(userId);
            if(usr1!=null){
            	usr1.setUserName(user.getUserName());
            	usr1.setGender(user.getGender());
            	usr1.setBirthday(user.getBirthday());

                return UserRepository.save(usr1);
            }
        }
		return null;
	}

	@Override
	public boolean delete(long userId) {
		// TODO Auto-generated method stub
        if(userId>=1){
            User usr1=UserRepository.getById(userId);
            if(usr1!=null){
                UserRepository.delete(usr1);
                return true;
            }
        }
        return false;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return UserRepository.findAll();
	}

	@Override
	public User getOne(long userId) {
		// TODO Auto-generated method stub
		return UserRepository.getById(userId);
	}

	@Override
	public List<Product> getProductbyUser(long userId) {
		// TODO Auto-generated method stub	
		if(userId != 0) {
			List<Product> allProduct= ProductRepository.findAll();
			List<Product> returnProduct = (List<Product>) new Product();
			int i=1;
			while(i<=allProduct.size()) {
				Product prd=allProduct.get(i);
				if(userId == prd.getUserId()) {
					returnProduct.add(prd);
				}
				i++;
			}
			return returnProduct;
		}
		return null;
	}
}
