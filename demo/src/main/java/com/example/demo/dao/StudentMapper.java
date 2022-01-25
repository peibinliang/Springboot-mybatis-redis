package com.example.demo.dao;

import com.example.demo.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer id);

    List<Student> selectAllStudent();

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}