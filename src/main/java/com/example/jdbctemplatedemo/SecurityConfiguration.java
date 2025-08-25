package com.example.jdbctemplatedemo;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class SecurityConfiguration {
    @Bean
    @Primary
    public DataSource dataSource1(){
        return DataSourceBuilder.create()
        .url("jdbc:sqlserver://localhost:1433;databaseName=employee;encrypt=true;trustServerCertificate=true")
        .username("sa")
        .password("Imaginnovate@123")
        .build();
    }

    @Bean
    public DataSource dataSource2(){
        return DataSourceBuilder.create()
        .url("jdbc:sqlserver://localhost:1433;databaseName=faculty;encrypt=true;trustServerCertificate=true")
        .username("sa")
        .password("Imaginnovate@123")
        .build();
    }

    @Bean
    public JdbcTemplate jdbcTemplate1(DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }

}
