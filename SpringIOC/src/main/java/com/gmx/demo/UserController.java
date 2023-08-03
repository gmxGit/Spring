package com.gmx.demo;

import gmx.Dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;
import service.impl.UserServiceimpl;

public class UserController {
    public static void main(String[] args) {
//        UserService service=new UserServiceimpl();
//        service.save();
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) app.getBean("UserService");
        userService.save();

    }
}
