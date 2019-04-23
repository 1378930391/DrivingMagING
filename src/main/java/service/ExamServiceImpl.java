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

    public List<Exam> findAllExam(){
        List<Exam> list = examDao.findAll();
        return list;
    }
}
