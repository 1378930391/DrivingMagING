package service;

import dao.ClassDao;
import dao.ExamDao;
import dao.StudentDao;
import domain.Exam;
import domain.Student;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;
    @Autowired
    private ExamDao examDao;
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Boolean orderExam(Student student, int exam_id) {
        //查询预约人数满没满
        Exam byId = examDao.findById(exam_id);
        if (byId.getExam_currPeople() < byId.getExam_maxPeople()) {
            //更新学员约考
            student.setStu_exam_id(byId);
            studentDao.update(student);
            //当前人数+1
            byId.setExam_currPeople(byId.getExam_currPeople() + 1);
            examDao.update(byId);
            return true;
        }
        return false;
    }

    @Override
    public void insert(Student student) {
        studentDao.save(student);
    }

    @Override
    public Student findById(String stu_id) {
        return studentDao.findById(stu_id);
    }

    @Override
    public Student findStudent(String stu_id) {
        return studentDao.findById(stu_id);
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
