package com.example.demo.entity;

import java.io.Serializable;

public class Student implements Serializable {
    private Integer id;

    private String studentname;

    private Integer studentnumber;

    private Integer score;

    private Integer studentclass;

    public Student(Integer id, String studentname, Integer studentnumber, Integer score, Integer studentclass) {
        this.id = id;
        this.studentname = studentname;
        this.studentnumber = studentnumber;
        this.score = score;
        this.studentclass = studentclass;
    }

    public Student() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname == null ? null : studentname.trim();
    }

    public Integer getStudentnumber() {
        return studentnumber;
    }

    public void setStudentnumber(Integer studentnumber) {
        this.studentnumber = studentnumber;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getStudentclass() {
        return studentclass;
    }

    public void setStudentclass(Integer studentclass) {
        this.studentclass = studentclass;
    }
}