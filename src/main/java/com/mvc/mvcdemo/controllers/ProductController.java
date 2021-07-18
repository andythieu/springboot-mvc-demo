package com.mvc.mvcdemo.controllers;

import java.util.List;

import com.mvc.mvcdemo.models.Product;
import com.mvc.mvcdemo.respositories.ProductRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/products")
    public List<Product> list() {
		LOGGER.info("Prod index");

        return productRepository.findAll();
    }

    @GetMapping("/products/{id}")
    public Product detail(@PathVariable("id") Long id) {
        LOGGER.info("Product detail: #", id);

        return productRepository.findById(id).orElse(null);
    }

    @PostMapping("/products")
    public Product create(@RequestBody Product product) {
		LOGGER.info("Create product");

        return productRepository.save(product);
    }

    @PutMapping("/products/{id}")
    public Product update(@RequestBody Product product) {
		LOGGER.info("Update product");

        return productRepository.save(product);
    }

    @DeleteMapping("/products/{id}")
    public void delete(@PathVariable("id") Long id) {
		LOGGER.info("Update product");

        productRepository.deleteById(id);
    }
}
