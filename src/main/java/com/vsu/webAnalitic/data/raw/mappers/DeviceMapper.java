package com.vsu.webAnalitic.data.raw.mappers;

import com.vsu.webAnalitic.data.raw.dto.DeviceDto;
import com.vsu.webAnalitic.data.raw.entity.Device;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DeviceMapper {
    DeviceMapper INSTANCE = Mappers.getMapper(DeviceMapper.class);
    DeviceDto entityToDto(Device device);
    List<DeviceDto> entityToDto(Iterable<Device> devices);
    Device dtoToEntity(DeviceDto dto);
    List<Device> dtoToEntity(Iterable<DeviceDto> dtos);
}
