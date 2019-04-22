package action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import service.StudentService;

import javax.annotation.Resource;
import java.util.List;

@Controller
@Scope("prototype")
public class StudentAction extends ActionSupport implements ModelDriven<Student> {
    private Student student = new Student();
    @Override
    public Student getModel() {
        return student;
    }

    @Autowired
    private StudentService studentService;

    //登陆
    public String login(){
        System.out.println(student);
        Student new_Student = studentService.findStudent(student.getStu_id());
        return new_Student == null ? ERROR : SUCCESS;
    }
    //学习
    public String study(){
        return "study";
    }
    //26.	查看自己的基本信息
    public String findStudent(){
        System.out.println(student);
        //ActionContext.getContext().getValueStack().findValue("student");
        Student new_Student = studentService.findStudent(student.getStu_id());
        return new_Student == null ? ERROR : "student_info";
    }
    //27.	查询当月考试信息
    public String findExan(){
        return "findExan";
    }

}
