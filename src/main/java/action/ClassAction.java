package action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import domain.Class;
import net.sf.json.JSONArray;
import net.sf.json.JsonConfig;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import service.ClassService;

import java.io.IOException;
import java.util.List;

@Controller
public class ClassAction extends ActionSupport implements ModelDriven<Class> {
    private Class clazz = new Class();
    @Override
    public Class getModel() {
        return clazz;
    }
    @Autowired
    private ClassService classService;
    //AJAX查所有班级
    public String findAllClass() throws IOException {
        List<Class> list = classService.findAll();
        JsonConfig jsonConfig = new JsonConfig();
        JSONArray jsonArray = JSONArray.fromObject(list);
        ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
        ServletActionContext.getResponse().getWriter().println(jsonArray.toString());
        return NONE;
    }
}
