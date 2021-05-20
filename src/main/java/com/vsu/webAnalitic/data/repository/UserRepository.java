package com.vsu.webAnalitic.data.repository;

import com.vsu.webAnalitic.data.raw.entity.RawUser;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface UserRepository extends PagingAndSortingRepository<RawUser, Long> {
}