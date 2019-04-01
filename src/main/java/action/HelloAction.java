package action;

import com.opensymphony.xwork2.ActionSupport;


public class HelloAction extends ActionSupport{

    /*private DepService depService;

    public void setDepService(DepService depService) {
        this.depService = depService;
    }*/

    public void hello(){
        //depService.findById(1);
        System.out.println("success");
    }


}
