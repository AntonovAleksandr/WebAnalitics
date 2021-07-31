package com.vsu.webAnalitic.data.acceleration.service.impl;

import com.vsu.webAnalitic.data.acceleration.repository.CounterRepository;
import com.vsu.webAnalitic.data.acceleration.service.AccCounterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccCounterServiceImpl implements AccCounterService {
    @Autowired
    private CounterRepository counterRepository;

}
