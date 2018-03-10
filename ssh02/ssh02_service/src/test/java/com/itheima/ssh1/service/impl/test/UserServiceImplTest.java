package com.itheima.ssh1.service.impl.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.itheima.ssh1.domain.User;
import com.itheima.ssh1.service.UserService;

/**  
 * ClassName:UserServiceImplTest <br/>  
 * Function:  <br/>  
 * Date:     2018年3月10日 下午3:21:40 <br/>       
 */
@RunWith(SpringJUnit4ClassRunner.class)
//classpath:spring/applicationContext*.xml:只加载本项目classpath文件下的配置文件
//classpath*:spring/applicationContext*.xml:加载本项目和依赖的项目的配置文件
@ContextConfiguration("classpath*:spring/applicationContext*.xml")
public class UserServiceImplTest {

    @Autowired
    private UserService userService;
    
    @Test
    public void test() {
        User user = userService.findById(2);
        assertEquals("李四", user.getUsername());
    }

}
  
