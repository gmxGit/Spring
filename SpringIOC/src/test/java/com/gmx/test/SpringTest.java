package com.gmx.test;

import gmx.Dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
@Test
    public void test(){
    ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
  UserDao userdao1 = (UserDao) app.getBean("UserDao");
//    UserDao userdao2 = (UserDao) app.getBean("UserDao");
//    System.out.println(userdao2);
   // System.out.println(userdao1);
    System.out.println(userdao1);
}
}
