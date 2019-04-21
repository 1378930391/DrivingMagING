package dao;

import domain.Teacher;
import org.springframework.stereotype.Repository;

@Repository("teacherDao")
public class TeacherDaoImpl extends BaseDaoImpl<Teacher> implements TeacherDao {
    public TeacherDaoImpl() {
        super(Teacher.class);
    }
}
