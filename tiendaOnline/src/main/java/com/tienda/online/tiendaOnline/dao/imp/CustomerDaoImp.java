package com.tienda.online.tiendaOnline.dao.imp;

import com.tienda.online.tiendaOnline.dao.CustomerDao;
import com.tienda.online.tiendaOnline.models.Customer;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional
@Repository
public class CustomerDaoImp implements CustomerDao {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    @Transactional
    public List<Customer> getAllCustomer() {
        String hqlObtenerTodosUsuarios = "FROM Customer as c";
        return (List<Customer>) entityManager.createQuery(hqlObtenerTodosUsuarios).getResultList();
    }

    @Override
    @Transactional
    public List<Customer> getUsersInOrder() {
        String hqlObtenerTodosUsuariosPorOrdenCreacion = "FROM Customer as c ORDER BY c.fechaCreacion DESC";
        return (List<Customer>) entityManager.createQuery(hqlObtenerTodosUsuariosPorOrdenCreacion).getResultList();
    }

    @Override
    @Transactional
    public Customer register(@RequestBody Customer user) {
        entityManager.merge(user);
        return user;
    }

    @Override
    @Transactional
    public Customer get(long id) {
        return entityManager.find(Customer.class, id);
    }

    @Override
    @Transactional
    public void delete(long id) {
        Customer usuarioEliminar = get(id);
        entityManager.remove(usuarioEliminar);
    }


}
