package com.li.back.controller;

import com.li.back.dto.StudentGetDto;
import com.li.back.dto.StudentPostDto;

import com.li.back.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/add")

public class StudentAddController {

    @Autowired
    private StudentService studentService;


    @PostMapping(
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<StudentGetDto> addStudent(@RequestBody StudentPostDto studentPostDto){
        return ResponseEntity.ok(studentService.addStudent(studentPostDto));
    }}








