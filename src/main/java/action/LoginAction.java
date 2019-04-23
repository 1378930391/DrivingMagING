package action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import domain.Admin;
import domain.Student;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import service.AdminService;
import service.StudentService;
import service.StudentServiceImpl;
import vo.LoginInfoVo;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 用户登录actin 1.学员 0.管理员
 * @author: Arnold
 * @since: 2019/4/21 16:53
 * @version: v1.0.0
 */
@Controller
public class LoginAction extends ActionSupport implements ModelDriven<LoginInfoVo> {
    @Autowired
    private StudentService studentService ;
    @Autowired
    private AdminService adminService;
    private LoginInfoVo loginInfoVo = new LoginInfoVo();

    @Override
    public LoginInfoVo getModel() {
        return this.loginInfoVo;
    }

    ActionContext context = ActionContext.getContext();

    public String login() {
        Map<String, Object> map = new HashMap();  //存放当前登录用户数据  admin or student
        //1.学员登录
        if(loginInfoVo==null||loginInfoVo.getStu_identity()==null)
            return ERROR;
        if (loginInfoVo.getIsStudent().equals("1")) {
            Student student = new Student();
            BeanUtils.copyProperties(loginInfoVo, student);
            if (studentService.login(student)!=null) {
                map.put("student", studentService.login(student));
                context.getSession().put("token", map);
                context.getSession().put("isStudent","1");
                ActionContext.getContext().getValueStack().set("name",student.getStu_name());
                return "stu_success";
            } else
                return ERROR;
        } else {
            //2.管理员登录
            Admin admin = new Admin();
            admin.setAdmin_name(Integer.parseInt(loginInfoVo.getStu_identity()));
            admin.setAdmin_password(loginInfoVo.getStu_tel());
            if (adminService.login(admin)!=null) {
                map.put("admin", adminService.login(admin));
                context.getSession().put("token", map);
                context.getSession().put("isStudent","0");
                ActionContext.getContext().getValueStack().set("name",admin.getAdmin_name());
                return "admin_success";
            } else
                return ERROR;
        }
    }

    public String logout() {
        //session 设置失效
        context.getSession().put("token", null);
        return "logout_success";
    }
}
