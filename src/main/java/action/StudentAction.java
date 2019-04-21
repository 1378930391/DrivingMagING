package action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import domain.Student;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import service.StudentService;

import javax.annotation.Resource;
import java.util.List;

@Controller("studentAction")
@Scope("prototype")
public class StudentAction extends ActionSupport implements ModelDriven<Student> {
    private Student student = new Student();
    @Override
    public Student getModel() {
        return student;
    }

    @Resource(name="studentService")
    private StudentService studentService;

    //插入学生
    public String insert(){
        studentService.save(student);
        return "student_info";
    }
    //更新学生状态
    public String update(){
        studentService.update(student);
        return "student_info";
    }
    //登陆
    public String login(){
        Student new_Student = studentService.findStudent(student.getStu_id());
        return new_Student == null ? ERROR : SUCCESS;
    }
    //学习
    public String study(){
        return "study";
    }
    //26.	查看自己的基本信息
    public String findStudent(){
        Student new_Student = studentService.findStudent(student.getStu_id());
        return new_Student == null ? ERROR : "****";
    }
    //27.	查询当月考试信息
    public String findExan(){
        return "findExan";
    }
    //查询所有
    public String findAll(){
        List<Student> studentList = studentService.findAll();

        return "findAll";
    }
}
