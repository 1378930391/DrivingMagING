//package action;
//
//import com.opensymphony.xwork2.ActionContext;
//import com.opensymphony.xwork2.ActionSupport;
//import com.opensymphony.xwork2.ModelDriven;
//import domain.Student;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import service.StudentService;
//
//import java.util.List;
//
//@Controller
//public class StudentAction extends ActionSupport implements ModelDriven<Student> {
//    private Student student = new Student();
//
//
//    @Autowired
//    private StudentService studentService;
//    @Override
//    public Student getModel() {
//        return student;
//    }
//    //插入学生
//    public String insert(){
//
//        return SUCCESS;
//    }
//    //更新学生状态
//    public String update(){
//
//        return SUCCESS;
//    }
//
//    public String queryAllStudent(){
//
//        List<Student> students = studentService.queryAllStudent();
//        ActionContext.getContext().getValueStack().set("students",students);
//
//        return SUCCESS;
//    }
//
//}
