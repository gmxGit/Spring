package gmx.Dao.impl;

import gmx.Dao.UserDao;
import lombok.Data;

@Data
public class UserDaoImpl implements UserDao {
    private String username;
    private int age;

   /* public UserDaoImpl() {
        System.out.println("impl已创建");
    }*/

    public void save() {
        System.out.println(username+"====="+age);
        System.out.println("save running……");
    }
}
