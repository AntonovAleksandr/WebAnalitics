package com.vsu.webAnalitic.data.service;

import com.vsu.webAnalitic.data.entities.ExceptionLog;
import com.vsu.webAnalitic.data.entities.Response;

import java.util.List;

public interface ExceptionService {
    List<ExceptionLog> findAll();
    ExceptionLog findByID(Long id);
}
