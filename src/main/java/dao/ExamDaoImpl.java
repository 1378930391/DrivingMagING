package dao;

import domain.Exam;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;


@Repository
public class ExamDaoImpl extends BaseDaoImpl<Exam> implements ExamDao {

    @Resource
    public void setSessionFactory0(SessionFactory sessionFactory){
        super.setSessionFactory(sessionFactory);
    }
    public ExamDaoImpl() {
        super(Exam.class);
    }
}
