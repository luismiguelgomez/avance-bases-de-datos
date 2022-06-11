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
    @CrossOrigin(origins = "http://localhost:8084")
    public ResponseEntity<List<Provider>> getAllProviders() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(providerService.getAllProviders());
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    @CrossOrigin(origins = "http://localhost:8084")
    public Provider registerCustomer(@RequestBody Provider provider) {
        return providerService.register(provider);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @CrossOrigin(origins = "http://localhost:8084")
    Provider get(@PathVariable long id) {
        return providerService.get(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @CrossOrigin(origins = "http://localhost:8084")
    void delete(@PathVariable long id) {
        providerService.delete(id);
    }
}
