package service;

import core.Student;

import java.util.Collection;

public interface StudentService {
    Student get(long id);
    Collection<Student> getAllStudents();
}
