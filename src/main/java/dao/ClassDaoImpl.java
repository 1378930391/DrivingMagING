package dao;

import domain.Class;
import org.hibernate.SessionFactory;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

import javax.annotation.Resource;

/**
 * @Description:
 * @author: Arnold
 * @since: 2019/4/22 8:24
 * @version: v1.0.0
 */
@Repository("classDao")
public class ClassDaoImpl extends BaseDaoImpl<Class> implements ClassDao {

    public ClassDaoImpl() {
        super(Class.class);
    }
    @Resource
    public void setSessionFactiory0(SessionFactory sessionFactory){
        super.setSessionFactory(sessionFactory);
    }
}
