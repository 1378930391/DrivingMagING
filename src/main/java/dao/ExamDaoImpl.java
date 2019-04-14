package dao;

import domain.Exam;

public class ExamDaoImpl extends BaseDaoImpl<Exam> implements ExamDao {
    public ExamDaoImpl() {
        super(Exam.class);
    }
}
