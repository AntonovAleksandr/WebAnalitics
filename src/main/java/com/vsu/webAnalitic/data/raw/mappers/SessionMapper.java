package com.vsu.webAnalitic.data.raw.mappers;

import com.vsu.webAnalitic.data.raw.dto.SessionDto;
import com.vsu.webAnalitic.data.raw.entity.Session;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SessionMapper {
    SessionMapper INSTANCE = Mappers.getMapper(SessionMapper.class);
    SessionDto entityToDto(Session session);
    List<SessionDto> entityToDto(Iterable<Session> sessions);
    Session dtoToEntity(SessionDto dto);
    List<Session> dtoToEntity(Iterable<SessionDto> dtos);
}
