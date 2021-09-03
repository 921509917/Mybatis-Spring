package cn.duan.dao;

import cn.duan.domain.User;

public interface UserDao {
    int insertUser(User user);
    User findUser(User user);
}
