package com.vsu.webAnalitic.data.raw.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MousePositionLogDto {
    private Long id;
    private Long xPos;
    private Long yPos;
    private Date date;
    private SessionDto sessionDto;
}
