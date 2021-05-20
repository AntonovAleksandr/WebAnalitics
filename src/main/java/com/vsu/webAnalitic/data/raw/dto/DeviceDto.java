package com.vsu.webAnalitic.data.raw.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeviceDto {
    private Long id;
    private String title;
    private String osTitle;
    private List<SessionDto> sessionDtos;
}
