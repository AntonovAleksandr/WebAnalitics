package com.vsu.webAnalitic.data.acceleration.mapper;
import com.vsu.webAnalitic.data.acceleration.dto.CounterDto;
import com.vsu.webAnalitic.data.acceleration.entity.Counter;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import java.util.List;

@Mapper(componentModel = "spring")
public interface CounterMapper {
    CounterMapper INSTANCE = Mappers.getMapper(CounterMapper.class);
    CounterDto gameToDto(Counter counter);
    List<CounterDto> itemToDto(Iterable<Counter> counters);
    Counter dtoToItems(CounterDto dto);
    List<Counter> dtoToItems(Iterable<CounterDto> dtoIterable);
}
