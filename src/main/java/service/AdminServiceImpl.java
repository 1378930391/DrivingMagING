package service;

import dao.AdminDao;
import dao.ClassDao;
import dao.StudentDao;
import domain.Admin;
import domain.Class;
import domain.Student;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @author: Arnold
 * @since: 2019/4/21 17:58
 * @version: v1.0.0
 */
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminDao adminDao;
    @Autowired
    private ClassDao classDao;
    @Autowired
    private StudentDao studentDao;

    @Override
    public Admin login(Admin admin) {
        Session session = new org.hibernate.cfg.Configuration().configure().buildSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Admin.class);
        criteria.add(Restrictions.eq("admin_name", admin.getAdmin_name()));
        criteria.add(Restrictions.eq("admin_password", admin.getAdmin_password()));
        List<Admin> list = criteria.list();
        return CollectionUtils.isEmpty(list) ? null : list.get(0);
    }

    @Override
    public Map<String, Integer> getIncome() {
        Map<String, Integer> map = new HashMap();
        List<Student> studentAll = studentDao.findAll();
        studentAll.forEach(e -> {
            Class c = e.getStu_class_type();
            if (!map.containsKey(c.getClass_type()))
                map.put(c.getClass_type().toString(), c.getClass_cost());
            else
                map.put(c.getClass_type().toString(), map.get(c.getClass_type().toString()) + c.getClass_cost());
        });

        return map;
    }

    @Override
    public Map<String, List<Student>> getAllStudentByClass() {
        Map<String, List<Student>> map = new HashMap();
        List<Student> studentAll = studentDao.findAll();
        studentAll.forEach(e -> {
            String classType = e.getStu_class_type().getClass_type().toString();
            if (!map.containsKey(classType)) {
                List<Student> list = new ArrayList();
                list.add(e);
                map.put(classType, list);
            } else {
                List list = map.get(classType);
                list.add(e);
                map.put(classType, list);
            }
        });

        return map;
    }

    @Override
    public Map<String, List<Student>> getAllStudentByTeacher() {
        Map<String, List<Student>> map = new HashMap();
        List<Student> studentAll = studentDao.findAll();
        studentAll.forEach(e -> {
            String teacherName = e.getStu_teacher_name().getTeacher_name();
            if (!map.containsKey(teacherName)) {
                List<Student> list = new ArrayList();
                list.add(e);
                map.put(teacherName, list);
            } else {
                List list = map.get(teacherName);
                list.add(e);
                map.put(teacherName, list);
            }
        });
        return map;
    }


}
