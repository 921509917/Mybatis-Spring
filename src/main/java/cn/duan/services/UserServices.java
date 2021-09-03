package cn.duan.services;

import cn.duan.domain.User;

public interface UserServices {
    int addUser(User user);
    boolean queryUser(User user);
}
