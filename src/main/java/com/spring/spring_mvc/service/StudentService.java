package com.spring.spring_mvc.service;

import java.util.List;

import com.spring.spring_mvc.dto.StudentDto;

public interface StudentService {
    StudentDto createStudent(StudentDto theStudentDto);
    StudentDto getStudentById(Long theId);
    List<StudentDto> getAllStudents();
    StudentDto updateStudent(Long theId, StudentDto theStudentDto);
    StudentDto patchStudent(Long theId, StudentDto theStudentDto);
    void deleteStudentById(Long theId);
}
