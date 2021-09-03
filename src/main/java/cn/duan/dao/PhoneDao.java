package cn.duan.dao;

import cn.duan.domain.Phone;

import java.util.List;

public interface PhoneDao {
    List<Phone> queryPhoneInfo();
    int insertPhoneInfo(Phone phone);
    Phone findPhoneInfo(Integer id);
    int delPhoneInfo(Integer id);
    int altPhoneInfo(Phone phone);
}
