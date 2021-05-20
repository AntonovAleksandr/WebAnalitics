package com.vsu.webAnalitic.data.raw.mappers;

import com.vsu.webAnalitic.data.raw.dto.ClickLogDto;
import com.vsu.webAnalitic.data.raw.entity.ClickLog;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ClickLogMapper {
    ClickLogMapper INSTANCE = Mappers.getMapper(ClickLogMapper.class);
    ClickLogDto entityToDto(ClickLog clickLog);
    List<ClickLogDto> entityToDto(Iterable<ClickLog> clickLogs);
    ClickLog dtoToEntity(ClickLogDto dto);
    List<ClickLog> dtoToEntity(Iterable<ClickLogDto> clickLogDtos);
}
