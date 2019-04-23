package service;

import com.opensymphony.xwork2.ActionContext;
import dao.ExamDao;
import dao.StudentDao;
import domain.Exam;
import domain.Student;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;
    @Autowired
    private ExamDao examDao;

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
    public List<Student> findAll() {
        List<Student> list = studentDao.findAll();
        return list;
    }

    @Override
    public void insert(Student student) {
        studentDao.save(student);
    }

    @Override
    public void update(Student student) {
        studentDao.update(student);
    }

    @Override
    public Student findById(String stu_id) {
        return studentDao.findById(stu_id);
    }
}
