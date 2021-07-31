package com.vsu.webAnalitic.data.service.impl;

import com.vsu.webAnalitic.data.acceleration.dto.CounterDto;
import com.vsu.webAnalitic.data.acceleration.entity.Counter;
import com.vsu.webAnalitic.data.service.CounterService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CounterServiceImpl implements CounterService {
    @Override
    public void add(CounterDto counterDto) {

    }

    @Override
    public List<Counter> findAll() {
        return null;
    }

    @Override
    public Counter findByID(Long id) {
        return null;
    }

    @Override
    public void getAll() {

    }
}
