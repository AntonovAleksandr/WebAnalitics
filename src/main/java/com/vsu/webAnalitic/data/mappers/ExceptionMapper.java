package com.vsu.webAnalitic.data.mappers;
import com.vsu.webAnalitic.data.dto.ExceptionLogDto;
import com.vsu.webAnalitic.data.entities.ExceptionLog;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import java.util.List;

@Mapper(componentModel = "spring")
public interface ExceptionMapper {
    ExceptionMapper INSTANCE = Mappers.getMapper(ExceptionMapper.class);
    ExceptionLogDto gameToDto(ExceptionLog exceptionLog);
    List<ExceptionLogDto> itemToDto(Iterable<ExceptionLog> exceptionLogs);
    ExceptionLog dtoToItems(ExceptionLogDto dto);
    List<ExceptionLog> dtoToItems(Iterable<ExceptionLogDto> dtoIterable);
}
