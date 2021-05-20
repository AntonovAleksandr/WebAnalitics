package com.vsu.webAnalitic.data.acceleration.mapper;

import com.vsu.webAnalitic.data.acceleration.dto.ExceptionLogDto;
import com.vsu.webAnalitic.data.acceleration.entity.ExceptionLog;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ExceptionLogMapper {
    ExceptionLogMapper INSTANCE = Mappers.getMapper(ExceptionLogMapper.class);
    ExceptionLogDto entityToDto(ExceptionLog exceptionLog);
    List<ExceptionLogDto> entityToDto(Iterable<ExceptionLog> exceptionLogs);
    ExceptionLog dtoToEntity(ExceptionLogDto dto);
    List<ExceptionLog> dtoToEntity(Iterable<ExceptionLogDto> dtos);
}
