package com.vsu.webAnalitic.data.raw.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SessionDto {
    private Long id;
    private String browserTitle;
    private DeviceDto deviceDto;
    private List<ExceptionDto> exceptionDtos;
    private List<MousePositionLogDto> mousePositionLogDtos;
    private RawProjectDto rawProjectDto;
}
