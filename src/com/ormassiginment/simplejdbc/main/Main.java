package com.ormassiginment.simplejdbc.main;

import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

public class Main {
    static JdbcTemplate jdbcTemplateObj;
    static SimpleDriverDataSource dataSourceObj;

    static String USERNAME = "root";
    static String PASSWORD = "87HsvI8m@";
    static String URL = "jdbc:mysql://localhost:3306/springjdbc";

    public static SimpleDriverDataSource getDatabaseConnection() {
        dataSourceObj = new SimpleDriverDataSource();
        try {
            dataSourceObj.setDriver(new com.mysql.cj.jdbc.Driver());
            dataSourceObj.setUrl(URL);
            dataSourceObj.setUsername(USERNAME);
            dataSourceObj.setPassword(PASSWORD);
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return dataSourceObj;
    }
    public static void main(String[] args) {
        jdbcTemplateObj = new JdbcTemplate(getDatabaseConnection());
        System.out.println("The Connection: "+ jdbcTemplateObj);
    }
}
