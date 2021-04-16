package com.vsu.webAnalitic.data.service;

import com.vsu.webAnalitic.data.entities.Response;
import com.vsu.webAnalitic.data.entities.User;

import java.util.List;

public interface ResponseService {
    List<Response> findAll();
    Response findByID(Long id);

}
