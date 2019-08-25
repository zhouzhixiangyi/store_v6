package cn.edu.ecut.store.service;

import cn.edu.ecut.store.domain.User;

import java.sql.SQLException;

public interface UserService {
    void userRegist(User user) throws SQLException;
}
