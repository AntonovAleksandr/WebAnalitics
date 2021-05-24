package com.vsu.webAnalitic.data.acceleration.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CounterDto {
    private Long id;
    private String title;
    private Long value;
    private Date activityStart;
    private Date activityFinish;
    private ProjectDto projectDto;

}
