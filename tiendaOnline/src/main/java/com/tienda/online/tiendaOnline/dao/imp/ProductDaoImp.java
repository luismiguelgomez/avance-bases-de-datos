package com.tienda.online.tiendaOnline.dao.imp;

import com.tienda.online.tiendaOnline.dao.ProductDao;
import com.tienda.online.tiendaOnline.models.Product;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional
@Repository
public class ProductDaoImp implements ProductDao {

    @PersistenceContext
    EntityManager entityManager;
    
    @Override
    @Transactional
    public List<Product> getAllProducts() {
        String hqlObtenerTodosProductos = "FROM Product as p";
        return entityManager.createQuery(hqlObtenerTodosProductos).getResultList();
    }

    @Override
    @Transactional
    public Product register(Product product) {
        entityManager.merge(product);
        return product;
    }

    @Override
    @Transactional
    public Product get(long id) {
        return entityManager.find(Product.class, id);
    }

    @Override
    @Transactional
    public boolean delete(long id) {
        boolean response = false;
        Product productEliminar = get(id);
        entityManager.remove(productEliminar);
        response = true;
        return response;
    }
}
