package com.tienda.online.tiendaOnline.dao.imp;

import com.tienda.online.tiendaOnline.dao.ProviderDao;
import com.tienda.online.tiendaOnline.models.Provider;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional
@Repository
public class ProviderDaoImp implements ProviderDao {
    @PersistenceContext
    EntityManager entityManager;

    @Override
    @Transactional
    public List<Provider> getAllProvider() {
        String hqlObtenerTodosProvedores = "FROM Provider as p";
        return (List<Provider>) entityManager.createQuery(hqlObtenerTodosProvedores).getResultList();
    }


    @Override
    @Transactional
    public Provider register(@RequestBody Provider provider) {
        entityManager.merge(provider);
        return provider;
    }

    @Override
    @Transactional
    public Provider get(long id) {
        return entityManager.find(Provider.class, id);
    }


    @Override
    @Transactional
    public void delete(long id) {
        Provider provedorEliminar = get(id);
        entityManager.remove(provedorEliminar);
    }
}
