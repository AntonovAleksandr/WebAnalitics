package com.vsu.webAnalitic.controller;

import com.vsu.webAnalitic.data.service.CounterService;
import com.vsu.webAnalitic.data.service.ExceptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class ExceptionController {
    @Autowired
    private ExceptionService exceptionService;
}
