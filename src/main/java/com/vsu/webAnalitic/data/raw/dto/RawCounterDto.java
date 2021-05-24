package com.vsu.webAnalitic.data.raw.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RawCounterDto {
    private Long id;
    private String title;
    private Date date;
    private RawProjectDto projectDto;
}
