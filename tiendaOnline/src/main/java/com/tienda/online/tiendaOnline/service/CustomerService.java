package com.tienda.online.tiendaOnline.service;

import com.tienda.online.tiendaOnline.dao.CustomerDao;
import com.tienda.online.tiendaOnline.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    CustomerDao customerDao;

    public List<Customer> getAllUsers(){
        return customerDao.getAllCustomer();
    }

    public Customer register(@RequestBody Customer user){
        return customerDao.register(user);
    }

    public Customer get(@PathVariable long id) {
        return customerDao.get(id);
    }

    public void delete(@PathVariable long id) {
        customerDao.delete(id);
    }

}
