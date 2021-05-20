package com.vsu.webAnalitic.data.service.impl;

import com.vsu.webAnalitic.data.raw.entity.Response;
import com.vsu.webAnalitic.data.service.ResponseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResponseServiceImpl implements ResponseService {
    @Override
    public List<Response> findAll() {
        return null;
    }

    @Override
    public Response findByID(Long id) {
        return null;
    }
}
