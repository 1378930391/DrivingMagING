package dao;

import domain.Exam;
import domain.Student;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;


@Repository("examDao")
public class ExamDaoImpl extends BaseDaoImpl<Exam> implements ExamDao {

    @Autowired
    public ExamDaoImpl() {
        super(Exam.class);
    }
    @Resource
    public void setSessionFactory0(SessionFactory sessionFactory){
        super.setSessionFactory(sessionFactory);
    }
    @Override
    public List<Exam> findBySubject(String exam_subject) {
        return (List<Exam>)this.getHibernateTemplate().find("from Exam where exam_subject = ?",exam_subject);
    }

    @Override
    public List<Student> queryAllStudent(Exam exam){
        return (List<Student>)this.getHibernateTemplate().find("from Student where stu_exam_id = ?",exam);
    }



}
