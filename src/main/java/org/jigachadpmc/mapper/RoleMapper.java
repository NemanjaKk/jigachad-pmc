package org.jigachadpmc.mapper;

import org.jigachadpmc.dto.RoleDto;
import org.jigachadpmc.entity.Role;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RoleMapper {
    Role roleDtoToRole(RoleDto roleDto);
}
