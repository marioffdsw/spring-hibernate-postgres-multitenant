package com.dolphiness.multitenant.config.multitenancy;



import com.dolphiness.multitenant.entities.Usuario;
import com.dolphiness.multitenant.repository.UserTenantRelationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class TenantNameFetcher extends UnboundTenantTask<Usuario> {

    @Autowired
    private UserTenantRelationRepository userTenantRelationRepository;

    @Override
    protected Usuario callInternal() {
        Usuario utr = userTenantRelationRepository.findByNombre(this.username);
        return utr;
    }
}