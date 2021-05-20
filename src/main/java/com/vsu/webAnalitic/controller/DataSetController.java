package com.vsu.webAnalitic.controller;

import com.vsu.webAnalitic.data.acceleration.dto.ExceptionLogDto;
import com.vsu.webAnalitic.data.service.ExceptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/app")
public class DataSetController {
    @Autowired
    private ExceptionService exceptionService;

    @PostMapping("/receive_log")
    @ResponseBody
    public void receiveLog(@RequestBody ExceptionLogDto exceptionLogDto){
        exceptionService.save(exceptionLogDto);
        return;
    }

    @PostMapping("/receive_mouth_path")
    @ResponseBody
    public void receiveMouthPath(@RequestBody ExceptionLogDto exceptionLogDto){
        exceptionService.save(exceptionLogDto);
        return;
    }

}
