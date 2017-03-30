package com.dolphiness.multitenant.controllers;

import com.dolphiness.multitenant.entities.Usuario;
import com.dolphiness.multitenant.repository.UserTenantRelationRepository;
import flexjson.JSONSerializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping( value = "/usuarios", produces = "application/json; charset=utf-8")
public class UsuarioController {

    private UserTenantRelationRepository repository;

    @Autowired
    public UsuarioController( UserTenantRelationRepository repository ){
        this.repository = repository;
    } // end constructor

    @RequestMapping( method = RequestMethod.GET )
    public String getUsuarios(){
        List<Usuario> usuarios = this.repository.findAll();

        return new JSONSerializer()
                .serialize(usuarios);
    } // end action method getUsuario

} // end Usuarios Controller