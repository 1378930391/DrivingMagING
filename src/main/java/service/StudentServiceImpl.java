package service;

import dao.StudentDao;
import domain.Student;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.hibernate.criterion.Restrictions;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import javax.security.auth.login.Configuration;
import java.util.List;

@Service("studentService")
@Transactional
public class StudentServiceImpl implements StudentService {
    @Resource(name="studentDao")
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
    public Student login(Student student) {
        Session session=new org.hibernate.cfg.Configuration().configure().buildSessionFactory().openSession();
        Criteria criteria=session.createCriteria(Student.class);
        criteria.add(Restrictions.eq("stu_identity",student.getStu_identity()));
        criteria.add(Restrictions.eq("stu_tel",student.getStu_tel()));
        List<Student> list = criteria.list();
        return CollectionUtils.isEmpty(list)?null:list.get(0);
    }
}
