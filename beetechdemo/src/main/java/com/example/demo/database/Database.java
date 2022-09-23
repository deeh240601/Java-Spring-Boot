package com.example.demo.database;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.models.Product;
import com.example.demo.repositories.ProductRepository;

@Configuration
public class Database {
	private static final Logger logger = LoggerFactory.getLogger(Database.class);
    @Bean
    CommandLineRunner initDatabase(ProductRepository productRepository) {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                Product productA = new Product( "Iphone 14 Pro Max 512GB", 35000000, 2022);
                Product productB = new Product("Iphone 14 Pro 128GB", 20000000, 2022);
                Product productC = new Product("Iphone 14 Pro Max 1TB", 40000000, 2022);  
                Product productD = new Product("Iphone 14 Pro 512GB", 29000000, 2022);
				logger.info("insert data: "+productRepository.save(productA));
                logger.info("insert data: "+productRepository.save(productB));
                logger.info("insert data: "+productRepository.save(productC));
                logger.info("insert data: "+productRepository.save(productD));
            }
        };
    }
}
