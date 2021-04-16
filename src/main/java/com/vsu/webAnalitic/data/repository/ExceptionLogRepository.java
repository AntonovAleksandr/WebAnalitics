package com.vsu.webAnalitic.data.repository;

import com.vsu.webAnalitic.data.entities.ExceptionLog;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ExceptionLogRepository extends PagingAndSortingRepository<ExceptionLog, Long> {
}
