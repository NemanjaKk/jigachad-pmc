package org.jigachadpmc.controller;

import org.jigachadpmc.dto.UserDto;
import org.jigachadpmc.entity.User;
import org.jigachadpmc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @PostMapping("/users")
    public User saveUser(@RequestBody UserDto userDto){
        return userService.saveUser(userDto);
    }
}
