package com.vsu.webAnalitic.data.raw.repository;

import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Connection;

public class RawProjectRepository {
    @Autowired
    private Connection conn;
}
