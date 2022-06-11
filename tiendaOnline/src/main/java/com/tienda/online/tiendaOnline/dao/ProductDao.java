package com.tienda.online.tiendaOnline.dao;

import com.tienda.online.tiendaOnline.models.Product;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface ProductDao {
    List<Product> getAllProducts();

    Product register(@RequestBody Product product);

    Product get(@PathVariable long id);

    boolean delete(@PathVariable long id) ;
}
