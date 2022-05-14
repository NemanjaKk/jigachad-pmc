package org.jigachadpmc.mapper;

import org.jigachadpmc.dto.UserDto;
import org.jigachadpmc.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
//    @Mappings({
//            @Mapping(target="name", source="userDto.name"),
//            @Mapping(target="password", source="userDto.password"),
//            @Mapping(target="email", source="userDto.email"),
//            @Mapping(target="role", source="userDto.role_id")
//    })
    User userDtoToUser(UserDto userDto);

//    UserDto userToUserDto(User user);
}
