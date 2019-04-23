package service;

import domain.Exam;
import domain.Student;

import java.util.List;



public interface ExamService {
    List<Exam> getAllExams();
    void update(Exam exam);
    Exam findOne(Integer exam_id);
    public List<Exam> queryAllExam();
    public boolean insertExam(Exam exam);
    public boolean deleteExam(Exam exam);
    public boolean updateExam1(Exam exam);
    public Exam findById(int exam_id);
    public List<Exam> findBySubject(String exam_subject);
    public List<Student> queryAllStudent(Exam exam);
    List<Exam> findAllExam();
}
