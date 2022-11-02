package com.rokomari.rokomariTube.service.impl;



import com.rokomari.rokomariTube.model.Role;
import com.rokomari.rokomariTube.reporitory.RoleRepository;
import com.rokomari.rokomariTube.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleRepository roleRepository;





    @Override
    public Role findById(Long id) {
        return roleRepository.getById(id);
    }
}
