package service;

import dao.TeacherDao;
import domain.Teacher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service("teacherService")
@Transactional
public class TeacherServiceImpl implements TeacherService {
    @Resource(name="teacherDao")
    private TeacherDao teacherDao;

    @Override
    public void update(Teacher teacher) {
        teacherDao.update(teacher);
    }

    @Override
    public void insert(Teacher teacher) {
        teacherDao.save(teacher);
    }
}
