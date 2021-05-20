package com.vsu.webAnalitic.data.acceleration.mapper;

import com.vsu.webAnalitic.data.acceleration.dto.ProjectDto;
import com.vsu.webAnalitic.data.acceleration.entity.Project;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProjectMapper {
    ProjectMapper INSTANCE = Mappers.getMapper(ProjectMapper.class);
    ProjectDto entityToDto(Project user);
    List<ProjectDto> entityToDto(Iterable<Project> users);
    Project dtoToEntity(ProjectDto dto);
    List<Project> dtoToEntity(Iterable<ProjectDto> dtos);
}
