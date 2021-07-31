package com.vsu.webAnalitic.data.acceleration.service.impl;

import com.vsu.webAnalitic.data.acceleration.repository.ExceptionLogRepository;
import com.vsu.webAnalitic.data.acceleration.repository.ProjectRepository;
import com.vsu.webAnalitic.data.acceleration.service.ExceptionLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExceptionLogServiceImpl implements ExceptionLogService {
    @Autowired
    private ExceptionLogRepository exceptionLogRepository;
}
