package org.jigachadpmc.mapper;

import org.jigachadpmc.dto.UserDto;
import org.jigachadpmc.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface UserMapper {
    @Mappings({
            @Mapping(target="name", source="userDto.name"),
            @Mapping(target="password", source="userDto.password"),
            @Mapping(target="email", source="userDto.email")
    })
    User userDtoToUser(UserDto userDto);
//    UserDto userToUserDto(User user);
}
