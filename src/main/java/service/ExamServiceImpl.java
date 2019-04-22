package service;

import dao.ExamDao;
import domain.Exam;
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
}
