package com.dolphiness.multitenant.repository;

import com.dolphiness.multitenant.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface UserTenantRelationRepository extends JpaRepository<Usuario, Long> {
    Usuario findByNombre( String nombre );
} // end UserTenantRelationRepository Interface