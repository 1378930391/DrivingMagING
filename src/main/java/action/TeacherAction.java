package action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import domain.Teacher;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import service.TeacherService;

import javax.annotation.Resource;

@Controller("teacherAction")
@Scope("prototype")
public class TeacherAction extends ActionSupport implements ModelDriven<Teacher> {
    private Teacher teacher;
    @Override
    public Teacher getModel() {
        return teacher;
    }

    @Resource(name="teacherService")
    private TeacherService teacherService;

    //插入教练
    public String insert(){
        teacherService.insert(teacher);
        return "teacher_info";
    }
    //更新教练
    public String update(){
        teacherService.update(teacher);
        return "teacher_info";
    }
    public String delete(){

        return "teacher_info";
    }
}
