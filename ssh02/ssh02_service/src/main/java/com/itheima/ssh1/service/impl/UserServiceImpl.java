package com.itheima.ssh1.service.impl;

import org.springframework.transaction.annotation.Transactional;

import com.itheima.ssh1.dao.UserDao;
import com.itheima.ssh1.domain.User;
import com.itheima.ssh1.service.UserService;

/**  
 * ClassName:UserServiceImpl <br/>  
 * Function:  <br/>  
 * Date:     2018年3月9日 下午9:20:49 <br/>       
 */
@Transactional
public class UserServiceImpl implements UserService {

    private UserDao userDao;
    
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    @Override
    public User findById(Integer id) {
        
        return userDao.findById(id);
    }

}
  
