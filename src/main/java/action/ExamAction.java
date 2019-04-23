package action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import domain.Exam;
import net.sf.json.JSONArray;
import net.sf.json.JsonConfig;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import service.ExamService;
import vo.ExamVo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ExamAction extends ActionSupport implements ModelDriven<Exam>{
    private Exam exam = new Exam();
    @Override
    public Exam getModel() {
        return exam;
    }
    @Autowired
    private ExamService examService;

    public String update(){

        return SUCCESS;
    }
    public String findAllExam(){
        List<Exam> list = examService.findAllExam();
        System.out.println(list.size());
        ActionContext.getContext().getValueStack().set("list", list);
        return "allExam";
    }

    public String findExamAll() throws IOException {
        List<Exam> list = examService.findAllExam();
        List<ExamVo> listVo=new ArrayList<ExamVo>();
        for (Exam e:list  ) {
            ExamVo vo=new ExamVo();
            BeanUtils.copyProperties(e,vo);
            vo.setExam_date(e.getExam_date().toString());
            listVo.add(vo);
        }
        JsonConfig jsonConfig = new JsonConfig();
        JSONArray jsonArray = JSONArray.fromObject(listVo);
        ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
        ServletActionContext.getResponse().getWriter().println(jsonArray.toString());
        return NONE;
    }
}
