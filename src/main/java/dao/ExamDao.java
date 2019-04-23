package dao;

import domain.Exam;
import domain.Student;

import java.util.List;

public interface ExamDao extends BaseDao<Exam> {

    public List<Exam> findBySubject(String exam_subject);
    public List<Student> queryAllStudent(Exam exam_id);

}
