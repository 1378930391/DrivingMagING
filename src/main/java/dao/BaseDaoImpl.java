package dao;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.io.Serializable;
import java.util.List;

public class BaseDaoImpl<T> extends HibernateDaoSupport implements BaseDao<T> {

    private Class clazz;
    public BaseDaoImpl(Class clazz){
        this.clazz = clazz;
    }

    /**
     * 省去其余Dao中的构造方法
     * @param
     */
    /*public BaseDaoImpl(){
        //反射:第一步获得Class
        Class clazz = this.getClass();  //正在被调用的那个类的Class, CustomerDaoImpl或 LinkManDaoImpl
        Type type = clazz.getGenericSuperclass();   //获得参数化类型:BaseDaoImpl<Customer>, BaseDaoImpl<LinkMan>
        //得到这个type是一个参数化类型,将type强转成参数化类型
        ParameterizedType pType = (ParameterizedType) type;
        //通过参数化类型获得实际类型参数. 得到的是一个数组,因为存在map这样的参数化类型
        Type[] types = pType.getActualTypeArguments();
        //获取第一个实际类型参数即可
        this.clazz = (Class) types[0];
    }*/
    @Override
    public void save(T t) {
        this.getHibernateTemplate().save(t);
    }

    @Override
    public void update(T t) {
        this.getHibernateTemplate().update(t);
    }

    @Override
    public void delete(T t) {
        this.getHibernateTemplate().delete(t);
    }

    @Override
    public T findById(Serializable id) {
        return (T)this.getHibernateTemplate().get(clazz,id);
    }

    @Override
    //查询所有的方法
    public List<T> findAll() {
        return (List<T>) this.getHibernateTemplate().find("from "+ clazz.getSimpleName());
    }

    @Override
    //统计个数的方法
    public Integer findCount(DetachedCriteria detachedCriteria) {
        //设置统计个数的条件
        detachedCriteria.setProjection(Projections.rowCount());
        List<Long> list = (List<Long>) this.getHibernateTemplate().findByCriteria(detachedCriteria);
        return list.size() > 0 ? list.get(0).intValue() : null;
    }

    @Override
    //分页查询的方法
    public List<T> findByPage(DetachedCriteria detachedCriteria, Integer begin, Integer pageSize) {
        detachedCriteria.setProjection(null);
        return (List<T>) this.getHibernateTemplate().findByCriteria(detachedCriteria, begin, pageSize);
    }
}
