package controller;

import core.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.StudentService;
import service.StudentServiceimpl;

import javax.inject.Inject;
import java.util.Collection;

@RequestMapping({"/student"})
@RestController
public class StudentController {

    @Value("${message}")
    private String message;
    @Inject
    private StudentService studentService;

    @GetMapping({"/msg"})
    public String getMessage() {
        return message;
    }
    @GetMapping
    public Collection<Student> getAll() {
        return studentService.getAllStudents();
    }




}
