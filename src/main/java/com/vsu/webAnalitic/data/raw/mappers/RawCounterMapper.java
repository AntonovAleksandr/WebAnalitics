package com.vsu.webAnalitic.data.raw.mappers;

import com.vsu.webAnalitic.data.raw.dto.MousePositionLogDto;
import com.vsu.webAnalitic.data.raw.dto.RawCounterDto;
import com.vsu.webAnalitic.data.raw.entity.MousePositionLog;
import com.vsu.webAnalitic.data.raw.entity.RawCounter;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RawCounterMapper {
    RawCounterMapper INSTANCE = Mappers.getMapper(RawCounterMapper.class);
    RawCounterDto entityToDto(RawCounter rawCounter);
    List<RawCounterDto> entityToDto(Iterable<RawCounter> rawCounters);
    RawCounter dtoToEntity(RawCounterDto dto);
    List<RawCounter> dtoToEntity(Iterable<RawCounterDto> dtos);
}
