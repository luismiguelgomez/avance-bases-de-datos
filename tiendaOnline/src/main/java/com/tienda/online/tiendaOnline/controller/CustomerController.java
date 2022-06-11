package com.tienda.online.tiendaOnline.controller;

import com.tienda.online.tiendaOnline.models.Customer;
import com.tienda.online.tiendaOnline.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<List<Customer>> getAllUsers() {
        return ResponseEntity
                .status(HttpStatus.OK)
                        .body(customerService.getAllUsers());
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Customer registerUser(@RequestBody Customer user) {
      return customerService.register(user);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    Customer get(@PathVariable long id) {
        return customerService.get(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    void delete(@PathVariable long id) {
        // TODO: eliminar en la base de datos al usuario
        customerService.delete(id);
    }

}
