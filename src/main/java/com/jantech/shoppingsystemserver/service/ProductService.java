package com.jantech.shoppingsystemserver.service;

import com.jantech.shoppingsystemserver.exception.UserNotFoundException;
import com.jantech.shoppingsystemserver.model.Product;
import com.jantech.shoppingsystemserver.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductService {
    private final ProductRepo productRepo;

    @Autowired
    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public Product addEmployee(Product product){
        return productRepo.save(product);
    }

    public List<Product> findAllProducts(){
        return productRepo.findAll();
    }

    public Product updateProduct(Product product){
        return productRepo.save(product);
    }

    public Product findProductById(Long id){
        return productRepo.findProductById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
    }
    public void deleteProduct(Long id){
        productRepo.deleteProductById(id);
    }
}
