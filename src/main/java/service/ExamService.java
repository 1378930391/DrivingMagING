package service;

import domain.Exam;
import domain.Student;

import java.util.List;



public interface ExamService {
    List<Exam> getAllExams();
    void update(Exam exam);
    Exam findOne(Integer exam_id);
    List<Exam> queryAllExam();
    boolean insertExam(Exam exam);
    boolean deleteExam(Exam exam);
    boolean updateExam1(Exam exam);
    Exam findById(int exam_id);
    List<Exam> findBySubject(String exam_subject);
    List<Student> queryAllStudent(Exam exam);
    List<Exam> findAllExam();
}
