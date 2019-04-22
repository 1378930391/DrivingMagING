package service;

import dao.ClassDao;
import dao.StudentDao;
import dao.StudentDaoImpl;
import domain.Student;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    private StudentDao studentDao;
    @Autowired
    private SessionFactory sessionFactory;
    @Autowired
    private ClassDao classDao;

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
        Session session=sessionFactory.openSession();
        Criteria criteria=session.createCriteria(Student.class);
        criteria.add(Restrictions.eq("stu_identity",student.getStu_identity()));
        criteria.add(Restrictions.eq("stu_tel",student.getStu_tel()));
        List<Student> list = criteria.list();
        return CollectionUtils.isEmpty(list)?null:list.get(0);
    }
}
