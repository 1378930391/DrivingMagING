package service;

import dao.TeacherDao;
import domain.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherDao teacherDao;

    @Override
    public void update(Teacher teacher) {
        teacherDao.update(teacher);
    }

    @Override
    public void insert(Teacher teacher) {
        teacherDao.save(teacher);
    }

    @Override
    public List<Teacher> findAll() {
        return teacherDao.findAll();
    }

    @Override
    public Teacher findById(Integer teaher_id) {
        return teacherDao.findById(teaher_id);
    }

    @Override
    public void delete(Teacher newT) {
        teacherDao.delete(newT);
    }
}
