package com.vsu.webAnalitic.data.raw.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RawProjectDto {
    private Long id;
    private RawUserDto ownerDto;
    private List<SessionDto> sessionDtos;
    private List<RawCounterDto> rawCounterDtos;
}
