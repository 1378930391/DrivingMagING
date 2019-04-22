package service;

import dao.StudentDao;
import domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.hibernate.criterion.Restrictions;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

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

    @Override
    public List<Student> findAll() {
        return studentDao.findAll();
    }
    @Override
    public boolean login(Student student) {
        DetachedCriteria criteria = DetachedCriteria.forClass(Student.class);
        criteria.add(Restrictions.eq("stu_identity", student.getStu_identity()));
        criteria.add(Restrictions.eq("stu_tel", student.getStu_tel()));
        return studentDao.findCount(criteria) == 1;
    }
}
