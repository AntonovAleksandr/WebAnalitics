package com.vsu.webAnalitic.data.acceleration.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExceptionLogDto {
    private Long id;
    private String base64Movie;
    private Date date;
    private String description;
    private Long responseNumber;
    private ProjectDto projectDto;
}
