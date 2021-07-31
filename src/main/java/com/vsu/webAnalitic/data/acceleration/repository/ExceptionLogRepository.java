package com.vsu.webAnalitic.data.acceleration.repository;

import com.vsu.webAnalitic.data.acceleration.entity.ExceptionLog;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ExceptionLogRepository extends PagingAndSortingRepository<ExceptionLog, Long> {
}
