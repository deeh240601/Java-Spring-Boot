package com.example.demo.service;
import com.example.demo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Product;

import java.util.List;

@Service
public class ProductServiceImpl implements  IProductService {
    @Autowired
    private ProductRepository ProductRepository;

    @Override
    public Product add(Product product) {
        if(product!=null){
            return ProductRepository.save(product);
        }
        return null;
    }

    @Override
    public Product update(long id, Product Product) {
        if(Product!=null){
            Product Product1=ProductRepository.getById(id);
            if(Product1!=null){
                Product1.setName(Product.getName());
                Product1.setPrice(Product.getPrice());
                Product1.setYear(Product.getYear());

                return ProductRepository.save(Product1);
            }
        }
        return null;
    }

    @Override
    public boolean delete(long id) {
        if(id>=1){
            Product Product=ProductRepository.getById(id);
            if(Product!=null){
                ProductRepository.delete(Product);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Product> getAll() {
        return ProductRepository.findAll();
    }

    @Override
    public Product getOne(long id) {
        return ProductRepository.getById(id);
    }
//
//	@Override
//	public Product addProduct(Product Product) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Product updateProduct(long id, Product Product) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Product getOne(long id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
}
