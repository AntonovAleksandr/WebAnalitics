package com.vsu.webAnalitic.data.raw.mappers;
import com.vsu.webAnalitic.data.raw.dto.ResponseDto;
import com.vsu.webAnalitic.data.raw.entity.Response;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import java.util.List;

@Mapper(componentModel = "spring")
public interface ResponseMapper {
    ResponseMapper INSTANCE = Mappers.getMapper(ResponseMapper.class);
    ResponseDto gameToDto(Response response);
    List<ResponseDto> itemToDto(Iterable<Response> responses);
    Response dtoToItems(ResponseDto dto);
    List<Response> dtoToItems(Iterable<ResponseDto> dtoIterable);
}
