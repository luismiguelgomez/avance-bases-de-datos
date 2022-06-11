package com.tienda.online.tiendaOnline.dao;

import com.tienda.online.tiendaOnline.models.Customer;
import com.tienda.online.tiendaOnline.models.Provider;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface ProviderDao {

    List<Provider> getAllProvider();

    Provider register(@RequestBody Provider provider);

    Provider get(@PathVariable long id);

    void delete(@PathVariable long id) ;
}
