package dao;

import core.Student;

import java.util.Collection;

public interface StudentDao {
    Student getOne(long id);
    Collection<Student> getAll();
}
