package com.vsu.webAnalitic.controller;

import com.vsu.webAnalitic.data.acceleration.dto.UserDto;
import com.vsu.webAnalitic.data.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/app")
public class UserController {

    @Autowired
    private UserService userService;
    @PostMapping("/add_user")
    @ResponseBody
    public void addUser(@RequestBody UserDto userDto){
        userService.add(userDto);
        return;
    }
}
