package com.vsu.webAnalitic.data.service;

import com.vsu.webAnalitic.data.raw.entity.Response;

import java.util.List;

public interface ResponseService {
    List<Response> findAll();
    Response findByID(Long id);

}
