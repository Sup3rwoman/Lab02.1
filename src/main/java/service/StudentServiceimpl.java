package service;

import com.fasterxml.jackson.annotation.JacksonInject;
import core.Student;
import dao.StudentDao;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.Collection;
@Named
public class StudentServiceimpl implements StudentService{
    @Inject
    private StudentDao studentDao;

    @Override
    public Student get(long id) {
        return studentDao.getOne(id);
    }

    @Override
    public Collection<Student> getAllStudents() {
        return studentDao.getAll();
    }

    public void setStudentDao(StudentDao studentDao){
        this.studentDao = studentDao;
    }
}
