package com.itheima.ssh1.dao.impl.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.itheima.ssh1.dao.UserDao;
import com.itheima.ssh1.domain.User;

/**  
 * ClassName:UserDaoImplTest <br/>  
 * Function:  <br/>  
 * Date:     2018年3月10日 下午3:13:49 <br/>  
 * @ContextConfiguration 指出配置文件在哪  
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext*.xml")
public class UserDaoImplTest {
    
    @Autowired
    private UserDao userDao;
    
    @Test
    public void testFindById() {
        User user = userDao.findById(1);
        assertEquals("张三", user.getUsername());
    }

}
  
