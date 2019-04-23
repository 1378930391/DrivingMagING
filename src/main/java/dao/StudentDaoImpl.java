package dao;

import domain.Student;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository("studentDao")
public class StudentDaoImpl extends BaseDaoImpl<Student> implements StudentDao {
    public StudentDaoImpl() {
        super(Student.class);
    }

    @Resource
    public void setSessionFactiory0(SessionFactory sessionFactory){
        super.setSessionFactory(sessionFactory);
    }

}
