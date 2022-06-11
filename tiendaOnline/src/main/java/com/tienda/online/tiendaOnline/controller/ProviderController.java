package com.tienda.online.tiendaOnline.controller;

import com.tienda.online.tiendaOnline.models.Customer;
import com.tienda.online.tiendaOnline.models.Provider;
import com.tienda.online.tiendaOnline.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("provider")
public class ProviderController {
    @Autowired
    ProviderService providerService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<List<Provider>> getAllProviders() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(providerService.getAllProviders());
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Provider registerCustomer(@RequestBody Provider provider) {
        return providerService.register(provider);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    Provider get(@PathVariable long id) {
        return providerService.get(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    void delete(@PathVariable long id) {
        providerService.delete(id);
    }
}
