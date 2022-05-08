package org.jigachadpmc.service;

import org.jigachadpmc.dto.UserDto;
import org.jigachadpmc.entity.User;
import org.jigachadpmc.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User saveUser(UserDto userDto){
        ModelMapper modelMapper = new ModelMapper();
        return userRepository.save(modelMapper.map(userDto, User.class));
    }

    public List<User> getUsers(){
        return userRepository.findAll();
    }

}
