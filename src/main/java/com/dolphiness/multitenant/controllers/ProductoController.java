package com.dolphiness.multitenant.controllers;

import com.dolphiness.multitenant.entities.Producto;
import com.dolphiness.multitenant.repository.ProductosRepository;
import flexjson.JSONSerializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping( value = "/productos", produces = "application/json; charset=utf-8")
public class ProductoController {

    private ProductosRepository repository;

    @Autowired
    public ProductoController(ProductosRepository repository) {
        this.repository = repository;
    }

    @RequestMapping( method = RequestMethod.GET )
    public String getProductos(){
        List<Producto> productos = repository.findAll();

        return new JSONSerializer()
                .serialize( productos );
    }
}
