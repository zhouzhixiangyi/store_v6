package cn.edu.ecut.store.service.serviceImp;

import cn.edu.ecut.store.dao.UserDao;
import cn.edu.ecut.store.dao.daoImp.UserDaoImp;
import cn.edu.ecut.store.domain.User;
import cn.edu.ecut.store.service.UserService;

import java.sql.SQLException;

public class UserServiceImp implements UserService {
    @Override
    public void userRegist(User user) throws SQLException {
        UserDao userDao = new UserDaoImp();
        userDao.userRegist(user);
    }
}
