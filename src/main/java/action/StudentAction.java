package action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import domain.Student;

public class StudentAction extends ActionSupport implements ModelDriven<Student> {
    private Student student = new Student();
    @Override
    public Student getModel() {
        return student;
    }
    //插入学生
    public String insert(){

        return SUCCESS;
    }
    //更新学生状态
    public String update(){

        return SUCCESS;
    }

}
