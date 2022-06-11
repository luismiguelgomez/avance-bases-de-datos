package com.tienda.online.tiendaOnline.controller;

import com.tienda.online.tiendaOnline.models.Order;
import com.tienda.online.tiendaOnline.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("order")
public class OrderController {
    @Autowired
    OrderService orderService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<List<Order>> getAllUsers() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(orderService.getAllOrders());
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Order registerUser(@RequestBody Order order) {
        return orderService.register(order);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    Order get(@PathVariable long id) {
        return orderService.get(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    void delete(@PathVariable long id) {
        orderService.delete(id);
    }
}
