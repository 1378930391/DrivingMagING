package dao;

import domain.Student;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDaoImpl extends BaseDaoImpl<Student> implements StudentDao {
    public StudentDaoImpl() {
        super(Student.class);
    }
}
