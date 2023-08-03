package factory;

import gmx.Dao.UserDao;
import gmx.Dao.impl.UserDaoImpl;

public class DynamicFactory {
public UserDao getUserDao(){

    return new UserDaoImpl();
}
}
