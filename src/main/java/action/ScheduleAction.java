package action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import domain.Schedule;
import net.sf.json.JSONArray;
import net.sf.json.JsonConfig;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import service.ScheduleService;

import java.io.IOException;
import java.util.List;

public class ScheduleAction extends ActionSupport implements ModelDriven<Schedule> {
    private Schedule schedule = new Schedule();
    @Override
    public Schedule getModel() {
        return schedule;
    }
    @Autowired
    private ScheduleService scheduleService;
    public String findAllSchedule() throws IOException {
        List<Schedule> list = scheduleService.findAll();
        JsonConfig jsonConfig = new JsonConfig();
        JSONArray jsonArray = JSONArray.fromObject(list);

        ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
        ServletActionContext.getResponse().getWriter().println(jsonArray.toString());
        return NONE;
    }
}
