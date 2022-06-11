package com.tienda.online.tiendaOnline.dao;

import com.tienda.online.tiendaOnline.models.Customer;
import com.tienda.online.tiendaOnline.models.Order;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface OrderDao {
    List<Order> getAllOrders();
    Order register(@RequestBody Order order);
    Order get(@PathVariable long id);
    boolean delete(@PathVariable long id) ;
}
