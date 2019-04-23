package dao;

import domain.Class;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @Description:
 * @author: Arnold
 * @since: 2019/4/22 8:24
 * @version: v1.0.0
 */
@Repository
public class ClassDaoImpl extends BaseDaoImpl<Class> implements ClassDao {


    @Resource
    public void setSessionFactory0(SessionFactory sessionFactory){
        super.setSessionFactory(sessionFactory);
    }
    @Autowired
    public ClassDaoImpl() {
        super(Class.class);
    }
}
