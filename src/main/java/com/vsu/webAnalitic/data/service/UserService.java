package com.vsu.webAnalitic.data.service;

import com.vsu.webAnalitic.data.entities.Response;
import com.vsu.webAnalitic.data.entities.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findByID(Long id);
}
