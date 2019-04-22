package service;

import domain.Exam;

import java.util.List;

public interface ExamService {
    List<Exam> getAllExams();
    void update(Exam exam);
    Exam findOne(Integer exam_id);
}
