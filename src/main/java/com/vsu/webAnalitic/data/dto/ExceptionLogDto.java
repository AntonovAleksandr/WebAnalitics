package com.vsu.webAnalitic.data.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExceptionLogDto {
    private Long id;
    private int responseId;
    private int userId;
}
