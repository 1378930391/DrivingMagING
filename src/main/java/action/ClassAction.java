package action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import domain.Class;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import service.ClassService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description:
 * @author: Arnold
 * @since: 2019/4/22 8:43
 * @version: v1.0.0
 */
@Controller
public class ClassAction extends ActionSupport implements ModelDriven<Class> {
    private Class clazz=new Class();
    @Override
    public Class getModel() {
        return this.clazz;
    }
    @Autowired
    private ClassService classService;

    /**
     * 19.学生查询开班的信息
     *
     * @return
     */
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
