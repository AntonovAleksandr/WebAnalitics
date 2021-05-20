package com.vsu.webAnalitic.data.raw.dto;

import com.vsu.webAnalitic.data.acceleration.dto.ExceptionLogDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDto {
    private Long id;
    private Long number;
    private String description;
    private List<ExceptionLogDto> excLogs;

}
