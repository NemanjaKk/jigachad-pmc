package org.jigachadpmc.controller;

import org.jigachadpmc.dto.RoleDto;
import org.jigachadpmc.dto.UserDto;
import org.jigachadpmc.entity.Role;
import org.jigachadpmc.entity.User;
import org.jigachadpmc.service.RoleService;
import org.jigachadpmc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoleController {

    private final RoleService roleService;

    @Autowired
    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping("/roles")
    public List<Role> getRoles(){
        return roleService.getRoles();
    }

    @PostMapping("/roles")
    public Role saveRole(@RequestBody RoleDto roleDto){
        return roleService.saveRole(roleDto);
    }
}
