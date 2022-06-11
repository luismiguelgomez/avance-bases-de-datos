package com.tienda.online.tiendaOnline.dao.imp;

import com.tienda.online.tiendaOnline.dao.OrderDao;
import com.tienda.online.tiendaOnline.models.Order;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional
@Repository
public class OrderDaoImp implements OrderDao {

    @PersistenceContext
    EntityManager entityManager;
    
    @Override
    @Transactional    
    public List<Order> getAllOrders() {
        String hqlObtenerTodosOrdenes = "FROM Order as o";
        return entityManager.createQuery(hqlObtenerTodosOrdenes).getResultList();
    }

    @Override
    @Transactional
    public Order register(Order order) {
        entityManager.merge(order);
        return order;
    }

    @Override
    @Transactional
    public Order get(long id) {
        return entityManager.find(Order.class, id);
    }

    @Override
    @Transactional
    public boolean delete(long id) {
        boolean response = false;
        Order orderEliminar = get(id);
        entityManager.remove(orderEliminar);
        response = true;
        return response;
    }

}
