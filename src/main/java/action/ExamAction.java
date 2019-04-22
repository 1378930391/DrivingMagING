package action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import domain.Exam;
import domain.Student;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.ExamService;
import service.ExamServiceImpl;

import javax.servlet.ServletRequest;
import javax.xml.ws.Action;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


@Controller
public class ExamAction extends ActionSupport implements ModelDriven<Exam> {


    private Exam exam = new Exam();

    @Override
    public Exam getModel() {
        return exam;
    }

    @Autowired
    private ExamService examService;


    public String queryAllStudent(){


        List<Student> students = examService.queryAllStudent(exam);
//        System.out.println(students.size());
        ActionContext.getContext().getValueStack().set("students",students);

        return "queryAllStudent";
    }


    public String queryAllExams(){

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

    public String updateExam(){

        examService.updateExam(exam);
        return "updateExam";
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


}
