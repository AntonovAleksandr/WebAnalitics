package com.vsu.webAnalitic.data.service;

import com.vsu.webAnalitic.data.acceleration.dto.ExceptionLogDto;
import com.vsu.webAnalitic.data.acceleration.entity.ExceptionLog;
import java.util.List;

public interface ExceptionService {
    void save(ExceptionLogDto exceptionLogDto);
    List<ExceptionLog> findAll();
    ExceptionLog findByID(Long id);
}
