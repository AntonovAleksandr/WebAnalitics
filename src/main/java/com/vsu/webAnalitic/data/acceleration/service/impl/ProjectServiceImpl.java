package com.vsu.webAnalitic.data.acceleration.service.impl;

import com.vsu.webAnalitic.data.acceleration.repository.ProjectRepository;
import com.vsu.webAnalitic.data.acceleration.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements ProjectService {
    @Autowired
    private ProjectRepository projectRepository;

}
