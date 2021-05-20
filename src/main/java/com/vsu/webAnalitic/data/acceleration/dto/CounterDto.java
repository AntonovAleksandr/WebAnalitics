package com.vsu.webAnalitic.data.acceleration.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CounterDto {
    private Long id;
    private String title;
    private Long value;
    private ProjectDto projectDto;

}
