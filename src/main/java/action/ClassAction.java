package action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import domain.Class;
import service.ClassService;

import javax.annotation.Resource;

/**
 * @Description:
 * @author: Arnold
 * @since: 2019/4/22 8:43
 * @version: v1.0.0
 */
public class ClassAction extends ActionSupport implements ModelDriven<Class> {
    private Class clazz;
    @Override
    public Class getModel() {
        return this.clazz;
    }
    @Resource(name = "classSesrvice")
    private ClassService classService;

    /**
     * 19.学生查询开班的信息
     *
     * @return
     */
    public String findAllClass() {
        classService.findAllClass();
        return "findAllClass";
    }

    /**
     * 20.根据id查询班级
     *
     * @return
     */
    public String findClassById() {
        return classService.findOne(clazz.getClass_id()) == null ? ERROR : "findClassById";
    }

    /**
     * 21.修改班级信息
     *
     * @return
     */
    public String updateClass() {
        classService.updateClass(clazz);
        return "updateClass";
    }


}
