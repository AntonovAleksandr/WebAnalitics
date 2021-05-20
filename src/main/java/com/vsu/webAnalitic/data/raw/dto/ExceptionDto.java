package com.vsu.webAnalitic.data.raw.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExceptionDto {
    private Long id;
    private Date date;
    private ResponseDto responseDto;
    private SessionDto sessionDto;
}
