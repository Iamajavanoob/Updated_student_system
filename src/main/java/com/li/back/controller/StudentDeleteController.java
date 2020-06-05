package com.li.back.controller;

import com.li.back.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/deleteById/{id}")
public class StudentDeleteController {
    @Autowired
    private StudentService studentService;

    @DeleteMapping(
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public void deleteStudent(@PathVariable("id") Long id){
        studentService.deleteStudent(id);
    }
}
