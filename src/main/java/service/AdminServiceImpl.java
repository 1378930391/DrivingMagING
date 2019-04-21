package service;

import dao.AdminDao;
import domain.Admin;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @author: Arnold
 * @since: 2019/4/21 17:58
 * @version: v1.0.0
 */
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminDao dao;

    @Override
    public boolean login(Admin admin) {
        DetachedCriteria criteria = DetachedCriteria.forClass(Admin.class);
        criteria.add(Restrictions.eq("admin_name", admin.getAdmin_name()));
        criteria.add(Restrictions.eq("admin_password", admin.getAdmin_password()));
        return dao.findCount(criteria) == 1;
    }
}
