package com.itheima.ssh1.dao.impl;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.itheima.ssh1.dao.UserDao;
import com.itheima.ssh1.domain.User;

/**  
 * ClassName:UserDaoImpl <br/>  
 * Function:  <br/>  
 * Date:     2018年3月9日 下午9:18:22 <br/>       
 */
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

    @Override
    public User findById(Integer id) {
        return getHibernateTemplate().get(User.class, id);
    }
    
    
}
  
