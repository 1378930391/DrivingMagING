package dao;

import domain.Teacher;
public class TeacherDaoImpl extends BaseDaoImpl<Teacher> implements TeacherDao {
    public TeacherDaoImpl() {
        super(Teacher.class);
    }
}
