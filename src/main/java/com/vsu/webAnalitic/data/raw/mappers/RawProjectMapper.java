package com.vsu.webAnalitic.data.raw.mappers;

import com.vsu.webAnalitic.data.raw.dto.RawProjectDto;
import com.vsu.webAnalitic.data.raw.entity.RawUser;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RawProjectMapper {
    RawProjectMapper INSTANCE = Mappers.getMapper(RawProjectMapper.class);
    RawProjectDto entityToDto(RawUser rawUser);
    List<RawProjectDto> entityToDto(Iterable<RawUser> rawUsers);
    RawUser dtoToEntity(RawProjectDto dto);
    List<RawUser> dtoToEntity(Iterable<RawProjectDto> dtos);
}
