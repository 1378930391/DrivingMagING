package action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import domain.Exam;

public class ExamAction extends ActionSupport implements ModelDriven<Exam>{
    private Exam exam = new Exam();
    @Override
    public Exam getModel() {
        return exam;
    }


    public String update(){

        return SUCCESS;
    }


}
