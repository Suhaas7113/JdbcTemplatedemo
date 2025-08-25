package com.example.jdbctemplatedemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

     public int save(Student student) {
        String sql = "INSERT INTO student (name, subject) VALUES (?, ?)";
        return jdbcTemplate.update(sql, student.getName(), student.getSubject());
    }

    public Student findById(int id) {
        String sql = "SELECT * FROM student WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new StudentRowMapper(), id);
    }

    public List<Student> findAll() {
        String sql = "SELECT * FROM student";
        return jdbcTemplate.query(sql, new StudentRowMapper());
    }

    public int update(Student student) {
        String sql = "UPDATE student SET name = ?, subject = ? WHERE id = ?";
        return jdbcTemplate.update(sql, student.getName(), student.getSubject(), student.getId());
    }

    public int deleteById(int id) {
        String sql = "DELETE FROM student WHERE id = ?";
        return jdbcTemplate.update(sql, id);
    }
}
