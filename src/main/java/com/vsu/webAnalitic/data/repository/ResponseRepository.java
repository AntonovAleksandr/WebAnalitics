package com.vsu.webAnalitic.data.repository;


import com.vsu.webAnalitic.data.entities.Response;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ResponseRepository extends PagingAndSortingRepository<Response, Long> {

}
