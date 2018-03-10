package com.itheima.ssh1.web;

import com.itheima.ssh1.domain.User;
import com.itheima.ssh1.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**  
 * ClassName:UserAction <br/>  
 * Function:  <br/>  
 * Date:     2018年3月9日 下午9:22:10 <br/>       
 */
public class UserAction extends ActionSupport implements ModelDriven<User>{

    private User model = new User();
    private Integer id;
    private UserService userService;
    @Override
    public User getModel() {
        return model;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    
    public String findById(){
        model=userService.findById(model.getId());
        return SUCCESS;
    }
    
}
  
