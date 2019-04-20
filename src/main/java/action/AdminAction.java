package action;


import com.opensymphony.xwork2.ActionSupport;
import domain.Admin;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import service.AdminService;

public class AdminAction extends ActionSupport {

    private AdminService adminService;

    public String toAdmin(){

        ServletActionContext.getRequest().getSession().setAttribute("admin",2);
        return SUCCESS;
    }
}
