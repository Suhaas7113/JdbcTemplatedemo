package com.example.jdbctemplatedemo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentRowMapper implements RowMapper<Student> {
    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student emp = new Student();
        emp.setId(rs.getInt("id"));
        emp.setName(rs.getString("name"));
        emp.setSubject(rs.getString("subject"));
        return emp;
    }
}
