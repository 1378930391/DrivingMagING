package action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import domain.Teacher;

public class TeacherAction extends ActionSupport implements ModelDriven<Teacher> {
    private Teacher teacher;
    @Override
    public Teacher getModel() {
        return teacher;
    }

}
