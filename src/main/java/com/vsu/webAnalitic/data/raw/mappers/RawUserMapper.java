package com.vsu.webAnalitic.data.raw.mappers;
import com.vsu.webAnalitic.data.acceleration.dto.UserDto;
import com.vsu.webAnalitic.data.raw.entity.RawUser;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RawUserMapper {
    RawUserMapper INSTANCE = Mappers.getMapper(RawUserMapper.class);
    UserDto gameToDto(RawUser rawUser);
    List<UserDto> itemToDto(Iterable<RawUser> users);
    RawUser dtoToItems(UserDto dto);
    List<RawUser> dtoToItems(Iterable<UserDto> dtoIterable);
}
