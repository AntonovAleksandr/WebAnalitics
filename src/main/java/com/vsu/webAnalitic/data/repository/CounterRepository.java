package com.vsu.webAnalitic.data.repository;

import com.vsu.webAnalitic.data.acceleration.entity.Counter;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface CounterRepository extends PagingAndSortingRepository<Counter, Long> {
}
