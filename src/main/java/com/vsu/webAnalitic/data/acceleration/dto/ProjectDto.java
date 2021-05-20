package com.vsu.webAnalitic.data.acceleration.dto;

import java.util.List;

public class ProjectDto {
    private Long id;
    private UserDto owner;
    private List<CounterDto> counterDtos;
    private List<ExceptionLogDto>  exceptionLogDtos;
}
