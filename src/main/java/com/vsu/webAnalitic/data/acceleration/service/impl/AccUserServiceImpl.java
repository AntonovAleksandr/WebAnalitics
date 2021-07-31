package com.vsu.webAnalitic.data.acceleration.service.impl;

import com.vsu.webAnalitic.data.acceleration.repository.UserRepository;
import com.vsu.webAnalitic.data.acceleration.service.AccUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Access;

@Service
public class AccUserServiceImpl implements AccUserService {
    @Autowired
    private UserRepository userRepository;
}
