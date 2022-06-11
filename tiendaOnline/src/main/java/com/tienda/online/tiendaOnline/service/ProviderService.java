package com.tienda.online.tiendaOnline.service;

import com.tienda.online.tiendaOnline.dao.ProviderDao;
import com.tienda.online.tiendaOnline.models.Customer;
import com.tienda.online.tiendaOnline.models.Provider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ProviderService {
    @Autowired
    ProviderDao providerDao;

    public List<Provider> getAllProviders(){return providerDao.getAllProvider();}

    public Provider register(@RequestBody Provider provider){
        return providerDao.register(provider);
    }

    public Provider get(@PathVariable long id) {
        return providerDao.get(id);
    }

    public void delete(@PathVariable long id) {
        providerDao.delete(id);
    }

}
