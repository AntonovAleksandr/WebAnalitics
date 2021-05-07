package com.vsu.webAnalitic.data.mappers;
import com.vsu.webAnalitic.data.dto.CounterDto;
import com.vsu.webAnalitic.data.dto.UserDto;
import com.vsu.webAnalitic.data.entities.Counter;
import com.vsu.webAnalitic.data.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    UserDto gameToDto(User user);
    List<UserDto> itemToDto(Iterable<User> users);
    User dtoToItems(UserDto dto);
    List<User> dtoToItems(Iterable<UserDto> dtoIterable);
}
