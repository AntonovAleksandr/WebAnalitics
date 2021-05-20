package com.vsu.webAnalitic.data.acceleration.mapper;

import com.vsu.webAnalitic.data.acceleration.dto.UserDto;
import com.vsu.webAnalitic.data.acceleration.entity.AccelUser;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    UserDto entityToDto(AccelUser user);
    List<UserDto> entityToDto(Iterable<AccelUser> users);
    AccelUser dtoToEntity(UserDto dto);
    List<AccelUser> dtoToEntity(Iterable<UserDto> dtos);
}
