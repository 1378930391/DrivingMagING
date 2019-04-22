package action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import domain.Exam;
import domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import service.ExamService;
import service.StudentService;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

public class ExamAction extends ActionSupport implements ModelDriven<Exam> {
    private Exam exam = new Exam();
    @Autowired
    private ExamService examService;
    @Autowired
    private StudentService studentService;

    @Override
    public Exam getModel() {
        return exam;
    }


    public String update() {

        return SUCCESS;
    }

    /**
     * 27.查询考试信息
     *
     * @return
     */
    public String getAllExams() {
        ActionContext.getContext().getValueStack().set("allExams", examService.getAllExams());
        return SUCCESS;
    }

    /**
     * 28.预约考试，有当次考试人数判断
     *
     * @return
     */
    public String updateExam() {
        //1.人数已满,直接返回失败
        Exam exam = examService.findOne(this.getModel().getExam_id());
        if (exam.getExam_currPeople().equals(exam.getExam_maxPeople()))
            return ERROR;
        //2.人数未满秀给相应数据
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        Student student = (Student) ((Map<String, Object>) request.getSession().getAttribute("token")).get("student");
        exam.setExam_currPeople(exam.getExam_currPeople() + 1);
        examService.update(exam);
        student.setStu_exam_id(exam);
        studentService.update(student);
        return SUCCESS;
    }

}
