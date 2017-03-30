package com.dolphiness.multitenant.repository;


import com.dolphiness.multitenant.entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductosRepository extends JpaRepository<Producto, Long> {
}
