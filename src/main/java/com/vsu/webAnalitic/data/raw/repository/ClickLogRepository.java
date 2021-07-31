package com.vsu.webAnalitic.data.raw.repository;

import org.springframework.beans.factory.annotation.Autowired;

import java.sql.*;

import static com.vsu.webAnalitic.data.raw.repository.ClickHouseConfig.DB_URL;

public class ClickLogRepository {

    @Autowired
    private Connection conn;

    public void ClickHouseJDBCDemo() throws SQLException {
        conn = DriverManager.getConnection(DB_URL);
    }

//    public void popularYearRoutes(int year) throws SQLException {
//        String query = "SELECT " +
//                "    OriginCityName, " +
//                "    DestCityName, " +
//                "    count(*) AS flights, " +
//                "    bar(flights, 0, 20000, 40) AS bar " +
//                "FROM ontime WHERE Year = ? GROUP BY OriginCityName, DestCityName ORDER BY flights DESC LIMIT 20";
//        long time = System.currentTimeMillis();
//        try (PreparedStatement statement = conn.prepareStatement(query)) {
//            statement.setInt(1, year);
////            try (ResultSet rs = statement.executeQuery()) {
////
////            }
//        }
//        System.out.println("Time: " + (System.currentTimeMillis() - time) +" ms");
//    }
}
