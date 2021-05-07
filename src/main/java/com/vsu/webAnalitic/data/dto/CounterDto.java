package com.vsu.webAnalitic.data.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CounterDto {
    private Long id;
    private String title;
    private Long value;

}
