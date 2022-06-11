package com.tienda.online.tiendaOnline.service;

import com.tienda.online.tiendaOnline.dao.OrderDao;
import com.tienda.online.tiendaOnline.models.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    OrderDao orderDao;

    public List<Order> getAllOrders(){
        return orderDao.getAllOrders();
    }

    public Order register(@RequestBody Order order){
        return orderDao.register(order);
    }

    public Order get(@PathVariable long id){
        return orderDao.get(id);
    }

    public boolean delete(@PathVariable long id) {
        return orderDao.delete(id);
    }
}
