package com.example.demo.service;

import com.example.demo.dao.StudentMapper;
import com.example.demo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentMapper studentMapper;

    public List<Student> getAllStudent(){
        return studentMapper.selectAllStudent();
    }

    //key 是学生id value 是学生这个实体
    @Cacheable(key = "#stuid", value = "Student")
    public Student SelectOneStuById(int stuid){
        return studentMapper.selectByPrimaryKey(stuid);
    }

    @CacheEvict(key = "#stuid", value = "Student")
    public Student updateStuName(int stuid, String stuname) {
        Student oldstu = studentMapper.selectByPrimaryKey(stuid);
        oldstu.setStudentname(stuname);
        int f = studentMapper.updateByPrimaryKey(oldstu);
        return oldstu;
    }
}
