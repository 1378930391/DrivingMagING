package service;

import dao.StudentDao;
import domain.Student;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao dao;

    public boolean login(Student student) {
        DetachedCriteria criteria = DetachedCriteria.forClass(Student.class);
        criteria.add(Restrictions.eq("stu_identity", student.getStu_identity()));
        criteria.add(Restrictions.eq("stu_tel", student.getStu_tel()));
        return dao.findCount(criteria) == 1;
    }
}
