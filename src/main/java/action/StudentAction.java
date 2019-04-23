package action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import domain.Student;
import net.sf.json.JSONArray;
import net.sf.json.JsonConfig;
import org.apache.struts2.ServletActionContext;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import service.StudentService;
import utils.TestEmail;

import javax.mail.MessagingException;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
public class StudentAction extends ActionSupport implements ModelDriven<Student> {
    private Student student = new Student();
    @Override
    public Student getModel() {
        return student;
    }

    @Autowired
    private StudentService studentService;
    //插入学生
    public String insert(){
        student.setStu_createtime(new Date());
        studentService.insert(student);
        return SUCCESS;
    }
    public String toUpdate(){
        student = studentService.findById(student.getStu_id());
        //System.out.println(student);
        return "update";
    }
    //更新学生状态
    public String update(){
        studentService.update(student);
        return SUCCESS;
    }

    //学生预约功能
    public String orderExam() throws MessagingException {

        //如果当前人数已满
        int exam_id = Integer.parseInt(ServletActionContext.getRequest().getParameter("exam_id"));
        //获取session中的student
        /*Map<String, Object> map = (Map<String, Object>) ServletActionContext.getRequest().getSession().getAttribute("token");
        student = (Student) map.get("student");*/
        student = studentService.findById("297e7e946a482188016a482580ac0003");
        //System.out.println(student);
        Boolean b = studentService.orderExam(student, exam_id);
        if(b){
            ServletActionContext.getRequest().setAttribute("msg", "预约成功");
            TestEmail email = new TestEmail();
            email.send(student);
        }
        else {
            ServletActionContext.getRequest().setAttribute("msg", "当前人数已满");
        }
        return "result";
    }
    //跳转到添加学生页面
    public String toStudentSave(){
        return "studentSave";
    }

    //添加学生
    public String studentSave(){
        return "result";
    }

    public String studentList(){
        List<Student> list = studentService.findAll();
        ActionContext.getContext().getValueStack().set("list", list);
        return "all";
    }
}
