package factory;

import gmx.Dao.UserDao;
import gmx.Dao.impl.UserDaoImpl;

public class staticfactory {
    public static UserDao getBean(){
        return new UserDaoImpl();
    }
}
