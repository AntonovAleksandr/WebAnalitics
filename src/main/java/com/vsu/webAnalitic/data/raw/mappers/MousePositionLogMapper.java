package com.vsu.webAnalitic.data.raw.mappers;

import com.vsu.webAnalitic.data.raw.dto.MousePositionLogDto;
import com.vsu.webAnalitic.data.raw.entity.MousePositionLog;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MousePositionLogMapper {
    MousePositionLogMapper INSTANCE = Mappers.getMapper(MousePositionLogMapper.class);
    MousePositionLogDto entityToDto(MousePositionLog mousePositionLog);
    List<MousePositionLogDto> entityToDto(Iterable<MousePositionLog> mousePositionLogs);
    MousePositionLog dtoToEntity(MousePositionLogDto dto);
    List<MousePositionLog> dtoToEntity(Iterable<MousePositionLogDto> dtos);
}
