package action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import domain.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import service.TeacherService;

import javax.annotation.Resource;
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
}
