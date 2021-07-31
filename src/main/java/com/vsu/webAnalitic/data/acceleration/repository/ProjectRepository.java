package com.vsu.webAnalitic.data.acceleration.repository;


import com.vsu.webAnalitic.data.acceleration.entity.Project;
import com.vsu.webAnalitic.data.raw.entity.Response;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProjectRepository extends PagingAndSortingRepository<Project, Long> {

}
