package com.vsu.webAnalitic.data.raw.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RawUserDto {
    private Long id;
    private String login;
    private String password;
    List<RawProjectDto> rawProjectDtos;
}
