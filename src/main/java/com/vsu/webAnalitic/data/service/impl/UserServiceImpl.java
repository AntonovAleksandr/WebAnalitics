package com.vsu.webAnalitic.data.service.impl;

import com.vsu.webAnalitic.data.acceleration.dto.UserDto;
import com.vsu.webAnalitic.data.raw.entity.RawUser;
import com.vsu.webAnalitic.data.acceleration.repository.UserRepository;
import com.vsu.webAnalitic.data.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private  UserRepository userRepository;
    @Override
    public void add(UserDto userDto) {

    }

    @Override
    public List<RawUser> findAll() {
        return null;
    }

    @Override
    public RawUser findByID(Long id) {
        return null;
    }
}
