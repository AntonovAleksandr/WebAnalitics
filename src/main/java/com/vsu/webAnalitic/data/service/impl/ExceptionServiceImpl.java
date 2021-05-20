package com.vsu.webAnalitic.data.service.impl;

import com.vsu.webAnalitic.data.acceleration.dto.ExceptionLogDto;
import com.vsu.webAnalitic.data.acceleration.entity.ExceptionLog;
import com.vsu.webAnalitic.data.service.ExceptionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExceptionServiceImpl implements ExceptionService {
    @Override
    public void save(ExceptionLogDto exceptionLogDto) {

    }

    @Override
    public List<ExceptionLog> findAll() {
        return null;
    }

    @Override
    public ExceptionLog findByID(Long id) {
        return null;
    }
}
