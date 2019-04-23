package dao;

import domain.Admin;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.io.Serializable;


@Repository
public class AdminDaoImpl<T> extends BaseDaoImpl<Admin> implements AdminDao {

    public AdminDaoImpl() { super(Admin.class); }

    @Resource
    public void setSessionFactory0(SessionFactory sessionFactory){
        super.setSessionFactory(sessionFactory);
    }
    public Admin findByName(int name) {

        return (Admin)this.getHibernateTemplate().find("from domain.Admin admin where admin_name = ?",name);
    }
    @Resource
    public void setSessionFactiory0(SessionFactory sessionFactory){
        super.setSessionFactory(sessionFactory);
    }
}
