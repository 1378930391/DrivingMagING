package dao;

import domain.Class;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class ClazzDaoImpl extends BaseDaoImpl<Class> implements ClazzDao {
    public ClazzDaoImpl() {
        super(Class.class);
    }
    @Resource
    public void setSessionFactory0(SessionFactory sessionFactory){super.setSessionFactory(sessionFactory);}

}
