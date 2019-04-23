package action;

import com.opensymphony.xwork2.ActionContext;
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
    public String findClassAll() throws IOException {
        List<Class> list = classService.findAll();
        JsonConfig jsonConfig = new JsonConfig();
        JSONArray jsonArray = JSONArray.fromObject(list);
        ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
        ServletActionContext.getResponse().getWriter().println(jsonArray.toString());
        return NONE;
    }

    public String findAllClass() {
        List<Class> allClass = classService.findAllClass();
        ActionContext.getContext().getValueStack().set("findAllClass",allClass);
        return "findAllClass";
    }

    /**
     * 20.根据id查询班级
     *
     * @return
     */
    public String findClassById() {
        ActionContext.getContext().getValueStack().set("findClassById",classService.findOne(clazz.getClass_id()));
        return classService.findOne(clazz.getClass_id()) == null ? ERROR : "findClassById";
    }

    /**
     * 21.修改班级信息
     *
     * @return
     */
    public String updateClass() {
        classService.updateClass(clazz);
        return this.findAllClass();
    }

}
