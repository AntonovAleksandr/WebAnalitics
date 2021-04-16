package com.vsu.webAnalitic.data.repository;

import com.vsu.webAnalitic.data.entities.User;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface UserRepository extends PagingAndSortingRepository<User, Long> {
}