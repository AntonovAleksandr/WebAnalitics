package com.vsu.webAnalitic.data.raw.repository;

import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Connection;

public class RawUserRepository {
    @Autowired
    private Connection conn;
}
