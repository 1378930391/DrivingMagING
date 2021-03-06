package service;

import dao.ExamDao;

import domain.Exam;
import domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ExamServiceImpl implements ExamService {
    @Autowired
    private ExamDao examDao;
    @Override
    public List<Exam> getAllExams() {
        return examDao.findAll();
    }

    @Override
    public void update(Exam exam) {
        examDao.update(exam);
    }

    @Override
    public Exam findOne(Integer exam_id) {
        return examDao.findById(exam_id);
    }

    public List<Student> queryAllStudent(Exam exam) {
        return examDao.queryAllStudent(exam);
    }


    public List<Exam> queryAllExam(){
        return examDao.findAll();
    }

    public boolean insertExam(Exam exam) {
        examDao.save(exam);
        return true;
    }

    public List<Exam> findBySubject(String exam_subject){
        return examDao.findBySubject(exam_subject);
    }

    public boolean deleteExam(Exam exam){
        examDao.delete(exam);
        return true;
    }
    public boolean updateExam1(Exam exam){
        examDao.update(exam);
        return true;
    }

    public Exam findById(int exam_id){
        return examDao.findById(exam_id);
    }

    public List<Exam> findAllExam(){
        List<Exam> list = examDao.findAll();
        return list;
    }
}
