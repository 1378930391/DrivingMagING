package service;

import dao.AdminDao;
import dao.AdminDaoImpl;
import domain.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AdminService {

    @Autowired
    private AdminDao adminDao;

    public Admin getAdminName(int name){
        return adminDao.findByName(name);
    }
}
