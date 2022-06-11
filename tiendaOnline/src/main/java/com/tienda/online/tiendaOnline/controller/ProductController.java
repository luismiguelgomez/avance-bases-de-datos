package com.tienda.online.tiendaOnline.controller;

import com.tienda.online.tiendaOnline.models.Product;
import com.tienda.online.tiendaOnline.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {
    @Autowired
    ProductService productService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @CrossOrigin(origins = "http://localhost:8084")
    public ResponseEntity<List<Product>> getAllProducts() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(productService.getAllProducts());
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    @CrossOrigin(origins = "http://localhost:8084")
    public Product registerCustomer(@RequestBody Product product) {
        return productService.register(product);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @CrossOrigin(origins = "http://localhost:8084")
    Product get(@PathVariable long id) {
        return productService.get(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @CrossOrigin(origins = "http://localhost:8084")
    void delete(@PathVariable long id) {
        productService.delete(id);
    }
}
