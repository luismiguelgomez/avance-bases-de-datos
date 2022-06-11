package com.tienda.online.tiendaOnline.service;

import com.tienda.online.tiendaOnline.dao.ProductDao;
import com.tienda.online.tiendaOnline.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductDao productDao;

    public List<Product> getAllProducts(){
        return productDao.getAllProducts();
    }

    public Product register(@RequestBody Product product){
        return productDao.register(product);
    }

    public Product get(@PathVariable long id){
        return productDao.get(id);
    }

    public boolean delete(@PathVariable long id){
        return productDao.delete(id);
    }
}
