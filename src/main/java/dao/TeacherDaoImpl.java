package dao;

import domain.Teacher;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class TeacherDaoImpl extends BaseDaoImpl<Teacher> implements TeacherDao {
    @Resource
    public void setSessionFactory0(SessionFactory sessionFactory){
        super.setSessionFactory(sessionFactory);
    }
    @Autowired
    public TeacherDaoImpl() {
        super(Teacher.class);
    }
}
