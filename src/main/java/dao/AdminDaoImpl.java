package dao;

import domain.Admin;
import org.springframework.stereotype.Repository;

import java.io.Serializable;


@Repository
public class AdminDaoImpl<T> extends BaseDaoImpl<Admin> implements AdminDao {

    public AdminDaoImpl() { super(Admin.class); }

    public Admin findByName(int name) {

        return (Admin)this.getHibernateTemplate().find("from domain.Admin admin where admin_name = ?",name);
    }
}
