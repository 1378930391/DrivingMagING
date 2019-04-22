package action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import domain.Exam;
import domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import service.ExamService;
import service.StudentService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;


@Controller
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



    public String queryAllStudent(){


        List<Student> students = examService.queryAllStudent(exam);
//        System.out.println(students.size());
        ActionContext.getContext().getValueStack().set("students",students);

        return "queryAllStudent";
    }


    public String queryAllExams1(){

        List<Exam>  exams  = examService.queryAllExam();
        ActionContext.getContext().getValueStack().set("exams",exams);
        return "queryAllExams";
    }

    public String deleteExam(){

        Exam exam1 = examService.findById(exam.getExam_id());
        examService.deleteExam(exam1);

        return "deleteExam";
    }

//    public String findById(){
//        examService.findById(exam.getExam_id());
//        return "findById";
//    }
    public String updateExamJump(){

        Exam exam1 = examService.findById(exam.getExam_id());
        ActionContext.getContext().getValueStack().set("exam",exam1);
        System.out.println(exam1.getExam_date());
        return "updateExamJump";
    }

    public String updateExam1(){

        examService.updateExam1(exam);
        return "updateExam1";
    }

    public String findBySubject(){


        List<Exam> exams = examService.findBySubject(exam.getExam_subject());
        ActionContext.getContext().getValueStack().set("exams",exams);

        return "queryAllExams";
    }

    public String insertExam(){

        examService.insertExam(exam);
        return "insertExam";
    }

    /**
     * 27.查询考试信息
     *
     * @return
     */
    public String getAllExams() {
        ActionContext.getContext().getValueStack().set("allExams", examService.getAllExams());
        return "getAllExams";
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
        return "updateExam";
    }

}
