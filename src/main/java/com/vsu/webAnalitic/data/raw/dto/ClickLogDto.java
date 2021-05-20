package com.vsu.webAnalitic.data.raw.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClickLogDto {
    private Long id;
    private MousePositionLogDto positionLogDto;
}
