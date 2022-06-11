package com.tienda.online.tiendaOnline.dao;

import com.tienda.online.tiendaOnline.models.Customer;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface CustomerDao {
    /**
     * Traer todos los usuarios
     * @return una lista de usuarios
     */
    List<Customer> getAllCustomer();

    /**
     * @param user viene del modelo de usuario
     * @return Un modelo user creado
     */
    Customer register(@RequestBody Customer user);

    /**
     *
     * @param id id de un usuario
     * @return un usuario
     */
    Customer get(@PathVariable long id);

    /**
     *
     * @param id id utilizado para eliminar un usuario
     */
    void delete(@PathVariable long id) ;

    /**
     * Lista de usuario de manera ascendente
     * @return Lista de usuarios de orden ascendente
     */
    List<Customer> getUsersInOrder();
}
