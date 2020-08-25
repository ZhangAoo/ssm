package com.all.controller;

import com.all.entity.Student;
import com.all.sercice.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

public class StudentHandler {
    @Autowired
    private StudentService studentService;

    @GetMapping("/index")
    public ModelAndView index(){
        List<Student> list=studentService.findAll();
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("list",list);
        modelAndView.setViewName("index");
        return modelAndView;
    }
}
