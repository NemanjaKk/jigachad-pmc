package org.jigachadpmc.service;

import org.jigachadpmc.dto.UserDto;
import org.jigachadpmc.entity.User;
import org.jigachadpmc.mapper.UserMapper;
import org.jigachadpmc.repository.UserRepository;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
        this.userMapper = Mappers.getMapper(UserMapper.class);
    }

    public User saveUser(UserDto userDto){
        return userRepository.save(userMapper.userDtoToUser(userDto));
    }

    public List<User> getUsers(){
        return userRepository.findAll();
    }

}
