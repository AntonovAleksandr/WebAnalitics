package com.vsu.webAnalitic.data.service;

import com.vsu.webAnalitic.data.acceleration.dto.UserDto;
import com.vsu.webAnalitic.data.raw.entity.RawUser;

import java.util.List;

public interface UserService {
    void add(UserDto userDto);
    List<RawUser> findAll();
    RawUser findByID(Long id);
}
