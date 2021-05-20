package com.vsu.webAnalitic.data.service;

import com.vsu.webAnalitic.data.acceleration.dto.CounterDto;
import com.vsu.webAnalitic.data.acceleration.entity.Counter;
import java.util.List;

public interface CounterService {
    void add(CounterDto counterDto);
    List<Counter> findAll();
    Counter findByID(Long id);
}
