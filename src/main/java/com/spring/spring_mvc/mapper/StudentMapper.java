package com.spring.spring_mvc.mapper;

import com.spring.spring_mvc.dto.StudentDto;
import com.spring.spring_mvc.entity.Student;

public class StudentMapper {

    // method will map Student to StudentDto
    public static StudentDto mapToStudentDto(Student theStudent) {
        return new StudentDto(theStudent.getId(),
                theStudent.getFirstName(),
                theStudent.getLastName(),
                theStudent.getEmail()
                );
    }

    // method will map StudentDto to Student
    public static Student mapToStudent(StudentDto theStudentDto) {
        return new Student(theStudentDto.getId(),
                theStudentDto.getFirstName(),
                theStudentDto.getLastName(),
                theStudentDto.getEmail()
                );
    }
}