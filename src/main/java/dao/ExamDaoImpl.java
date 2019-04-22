package dao;

import domain.Exam;
import domain.Student;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;


@Repository
public class ExamDaoImpl extends BaseDaoImpl<Exam> implements ExamDao {

    @Resource
    public void setSessionFactory0(SessionFactory sessionFactory){
        super.setSessionFactory(sessionFactory);
    }
    @Autowired
    public ExamDaoImpl() {
        super(Exam.class);
    }

    @Override
    public List<Exam> findBySubject(String exam_subject) {
        return (List<Exam>)this.getHibernateTemplate().find("from Exam where exam_subject = ?",exam_subject);
    }

    @Override
    public List<Student> queryAllStudent(int exam_id){
        System.out.println(exam_id+"DAO");
        return (List<Student>)this.getHibernateTemplate().find("from Student where stu_exam_id = ?",3);
    }
}
