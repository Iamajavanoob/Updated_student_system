package com.li.back.controller;

import com.li.back.entity.Student;
import com.li.back.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/find")
public class StudentFindController {
    @Autowired
    private StudentService studentService;

    @GetMapping(
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Collection<Student>> findAll(){
        return ResponseEntity.ok(studentService.findAll());
    }

}
