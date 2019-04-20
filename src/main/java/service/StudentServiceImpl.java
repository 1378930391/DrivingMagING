package service;

import dao.StudentDao;
import domain.Student;

public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao;

    public StudentDao getStudentDao() {
        return studentDao;
    }

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public Student findStudent(String stu_id) {
        return studentDao.findById(stu_id);
    }

    @Override
    public void save(Student student) {
        studentDao.save(student);
    }

    @Override
    public void update(Student student) {
        studentDao.update(student);
    }
}
