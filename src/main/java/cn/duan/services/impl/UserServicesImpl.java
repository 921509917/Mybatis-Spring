package cn.duan.services.impl;

import cn.duan.dao.UserDao;
import cn.duan.domain.User;
import cn.duan.services.UserServices;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
@Component
public class UserServicesImpl implements UserServices {
    UserDao userDao;

    @Resource
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public int addUser(User user) {
        return userDao.insertUser(user);
    }

    @Override
    public boolean queryUser(User user) {
        if (userDao.findUser(user) != null)
            return true;
        else
            return false;
    }
}
