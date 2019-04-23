package action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import domain.Teacher;
import net.sf.json.JSONArray;
import net.sf.json.JsonConfig;
import org.apache.struts2.ServletActionContext;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import service.TeacherService;

import java.io.IOException;
import java.util.List;

@Controller
@Scope("prototype")
public class TeacherAction extends ActionSupport implements ModelDriven<Teacher> {
    private Teacher teacher = new Teacher();
    @Override
    public Teacher getModel() {
        return teacher;
    }

    @Autowired
    private TeacherService teacherService;
    @Autowired
    private SessionFactory sessionFactory;
    //AJAX查所有老师
    public String findAllTeacher() throws IOException {
        List<Teacher> list = teacherService.findAll();
        JsonConfig jsonConfig = new JsonConfig();
        JSONArray jsonArray = JSONArray.fromObject(list);
        ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
        ServletActionContext.getResponse().getWriter().println(jsonArray.toString());
        return NONE;
    }
    //插入教练
    public String insert(){
        System.out.println(teacher);
        teacherService.insert(teacher);
        return "teacher_success";
    }
    //更新教练
    public String update(){
        teacherService.update(teacher);
        return "teacher_success";
    }
    //删除
    public String delete(){
        Teacher newT = teacherService.findById(teacher.getTeacher_id());
        System.out.println(newT);
        teacherService.delete(newT);
        return "teacher_info";
    }
    //查询一个
    public String findOne(){
        teacher = teacherService.findById(teacher.getTeacher_id());
        ActionContext.getContext().getValueStack().set("teacher",teacher);
        return "teacher_info";
    }
    //查询所有
    public String findAll(){
        List<Teacher> teacherList = teacherService.findAll();
        ActionContext.getContext().getValueStack().set("teacherList",teacherList);
        return "teacher_all_info";
    }

    //按科目查询
    public String findByLevel(){
        Session session=sessionFactory.openSession();
        Criteria criteria=session.createCriteria(Teacher.class);
        criteria.add(Restrictions.eq("teacher_level",teacher.getTeacher_level()));
        List<Teacher> teacherList = criteria.list();
        ActionContext.getContext().getValueStack().set("teacherList",teacherList);
        return "teacher_all_info";
    }
    //按部门查询
    public String findByDepartment(){
        Session session=sessionFactory.openSession();
        Criteria criteria=session.createCriteria(Teacher.class);
        criteria.add(Restrictions.eq("teacher_department",teacher.getTeacher_department()));
        List<Teacher> teacherList = criteria.list();
        ActionContext.getContext().getValueStack().set("teacherList",teacherList);
        return "teacher_all_info";
    }
}
