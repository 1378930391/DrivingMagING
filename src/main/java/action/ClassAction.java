package action;

import com.opensymphony.xwork2.ActionSupport;
import domain.Class;
import service.ClassService;

import javax.annotation.Resource;

/**
 * @Description:
 * @author: Arnold
 * @since: 2019/4/22 8:43
 * @version: v1.0.0
 */
public class ClassAction extends ActionSupport {
    @Resource(name = "classSesrvice")
    private ClassService classService;

    /**
     * 19.学生查询开班的信息
     *
     * @return
     */
    public String findAllClass() {
        classService.findAllClass();
        return SUCCESS;
    }

    /**
     * 20.根据id查询班级
     *
     * @return
     */
    public String findClassById(Integer class_id) {
        return classService.findOne(class_id) == null ? ERROR : SUCCESS;
    }

    /**
     * 21.修改班级信息
     *
     * @return
     */
    public String updateClass(Class clazz) {
        classService.updateClass(clazz);
        return SUCCESS;
    }
}
