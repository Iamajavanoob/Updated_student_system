package com.li.back.controller;

import com.li.back.dto.StudentGetDto;
import com.li.back.dto.StudentPostDto;
import com.li.back.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/update")
public class StudentUpdateController {
    @Autowired
    private StudentService studentService;

    @PutMapping()

    public ResponseEntity<StudentGetDto> updateStudent(@RequestBody StudentPostDto studentPostDto){
        return ResponseEntity.ok(studentService.addStudent(studentPostDto));
    }

}
