package org.jigachadpmc.service;

import org.jigachadpmc.dto.RoleDto;
import org.jigachadpmc.entity.Role;
import org.jigachadpmc.mapper.RoleMapper;
import org.jigachadpmc.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {
    private final RoleRepository roleRepository;
    private final RoleMapper roleMapper;

    @Autowired
    public RoleService(RoleRepository roleRepository, RoleMapper roleMapper) {
        this.roleRepository = roleRepository;
        this.roleMapper = roleMapper;
    }

    public Role saveRole(RoleDto roleDto){
        return roleRepository.save(roleMapper.roleDtoToRole(roleDto));
    }

    public List<Role> getRoles(){
        return roleRepository.findAll();
    }
}
