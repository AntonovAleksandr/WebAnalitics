package com.vsu.webAnalitic.data.mappers;
import com.vsu.webAnalitic.data.dto.CounterDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.vsu.webAnalitic.data.entities.Counter;
import java.util.List;

@Mapper(componentModel = "spring")
public interface CounterMapper {
    CounterMapper INSTANCE = Mappers.getMapper(CounterMapper.class);
    CounterDto gameToDto(Counter counter);
    List<CounterDto> itemToDto(Iterable<Counter> counters);
    Counter dtoToItems(CounterDto dto);
    List<Counter> dtoToItems(Iterable<CounterDto> dtoIterable);
}
