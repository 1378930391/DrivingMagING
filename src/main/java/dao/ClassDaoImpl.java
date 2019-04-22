package dao;

import domain.Class;
import org.springframework.stereotype.Repository;

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
}
