package action;


import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import domain.Admin;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import service.AdminService;
@Controller
public class AdminAction extends ActionSupport {
    @Autowired
    private AdminService adminService;

    public String toAdmin() {
        ServletActionContext.getRequest().getSession().setAttribute("admin", 2);
        return SUCCESS;
    }

    /**
     * 21.查询驾校收入
     *
     * @return
     */
    public String getIncome() {
        ActionContext.getContext().getValueStack().set("incomeList", adminService.getIncome());
        return "getIncome";
    }

    /**
     * 23.查询不同班级所有的学生
     *
     * @return
     */
    public String getAllStudentByClass() {
        ActionContext.getContext().getValueStack().set("allStudentByClass", adminService.getAllStudentByClass());
        return "allStudentByClass";
    }

    /**
     * 22.列出每个教练的所有学生。
     *
     * @return
     */
    public String getAllStudentByTeacher() {
        ActionContext.getContext().getValueStack().set("allStudentByTeacher", adminService.getAllStudentByTeacher());
        return "allStudentByTeacher";
    }

}
