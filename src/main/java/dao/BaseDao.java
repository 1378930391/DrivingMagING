package dao;

import org.hibernate.criterion.DetachedCriteria;

import java.io.Serializable;
import java.util.List;

/**
 * 通用Dao的接口
 */
public interface BaseDao<T> {
    void save(T t);
    void update(T t);
    void delete(T t);
    T findById(Serializable id);
    List<T> findAll();

    //统计个数的方法
    Integer findCount(DetachedCriteria detachedCriteria);
    //分页查询的方法
    List<T> findByPage(DetachedCriteria detachedCriteria, Integer begin, Integer pageSize);
}
