package cn.edu.ecut.store.dao.daoImp;

import cn.edu.ecut.store.dao.UserDao;
import cn.edu.ecut.store.domain.User;
import cn.edu.ecut.store.utils.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;

import javax.sql.DataSource;
import java.sql.SQLException;

public class UserDaoImp implements UserDao {
    @Override
    public void userRegist(User user) throws SQLException {
        String sql = " INSERT INTO user VALUES(?,?,?,?,?,?,?,?,?,?)";
        QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());
        Object [] params = {user.getUid(), user.getUsername() , user.getPassword() , user.getName() , user.getEmail() , user.getTelephone() , user.getBirthday() , user.getSex() , user.getState() , user.getCode()};
        queryRunner.update(sql , params);
    }
}
