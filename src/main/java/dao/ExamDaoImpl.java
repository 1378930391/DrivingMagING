package dao;

import domain.Exam;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class ExamDaoImpl extends BaseDaoImpl<Exam> implements ExamDao {
    public ExamDaoImpl() {
        super(Exam.class);
    }
    @Resource
    public void setSessionFactory0(SessionFactory sessionFactory){super.setSessionFactory(sessionFactory);}

}
