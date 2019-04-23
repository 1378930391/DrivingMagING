package dao;

import domain.Schedule;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class ScheduleDaoImpl extends BaseDaoImpl<Schedule> implements ScheduleDao {
    public ScheduleDaoImpl() {
        super(Schedule.class);
    }
    @Resource
    public void setSessionFactory0(SessionFactory sessionFactory){super.setSessionFactory(sessionFactory);}

}
