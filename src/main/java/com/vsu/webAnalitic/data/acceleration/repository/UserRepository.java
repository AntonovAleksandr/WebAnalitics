package com.vsu.webAnalitic.data.acceleration.repository;

import com.vsu.webAnalitic.data.acceleration.entity.AccelUser;
import com.vsu.webAnalitic.data.raw.entity.RawUser;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface UserRepository extends PagingAndSortingRepository<AccelUser, Long> {
}