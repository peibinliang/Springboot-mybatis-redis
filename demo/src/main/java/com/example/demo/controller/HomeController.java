package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/")
    public String gethome(Model model){
        List<Student> allstu = new ArrayList<>();
        allstu = studentService.getAllStudent();
        model.addAttribute("wgstu",allstu);
        return "index";
    }

    // 读取学生信息，测试缓存使用：除了首次读取，接下来都应该从缓存中读取
    @RequestMapping(value="{id}")
    @ResponseBody
    public Student getStu(@PathVariable long id){
        System.out.println(id);
        Student onestu = studentService.SelectOneStuById((int) id);
        return onestu;
    }

    // 更新学生信息
    @RequestMapping(value="{id}/wgname")
    @ResponseBody
    public Student UpdateStu(@PathVariable long id){
        System.out.println(id);
        String name = "ceshi";
        Student onestu = studentService.updateStuName((int) id,name);
        return onestu;
    }
}
