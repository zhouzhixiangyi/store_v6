package cn.edu.ecut.store.dao;

import cn.edu.ecut.store.domain.User;

import java.sql.SQLException;

public interface UserDao {
    void userRegist(User user) throws SQLException;
}
