package dao;

import domain.Admin;

public interface AdminDao extends BaseDao<Admin> {

    public Admin findByName(int name);
}
