package com.dolphiness.multitenant.entities;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Usuario {

    @Id
    private Integer id;
    private String nombre;
    private String tenant;

    public Usuario() {
    }

    public Usuario(Integer id, String nombre, String tenant) {
        this.id = id;
        this.tenant = tenant;
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTenant() {
        return tenant;
    }

    public void setTenant(String tenant) {
        this.tenant = tenant;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
