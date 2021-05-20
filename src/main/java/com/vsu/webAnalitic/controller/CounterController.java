package com.vsu.webAnalitic.controller;

import com.vsu.webAnalitic.data.acceleration.dto.CounterDto;
import com.vsu.webAnalitic.data.service.CounterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/app")
public class CounterController {
    @Autowired
    private CounterService counterService;

    @PostMapping("/add_counter")
    @ResponseBody
    public void addCounter(@RequestBody CounterDto counterDto){
        counterService.add(counterDto);
        return;
    }
}
