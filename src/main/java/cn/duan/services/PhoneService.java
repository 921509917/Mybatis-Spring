package cn.duan.services;

import cn.duan.domain.Phone;

import java.util.List;

public interface PhoneService {
    List<Phone> showPhoneInfo();
    boolean addPhoneInfo(Phone phone);
    Phone selectPhoneInfo(Integer id);
    boolean delPhoneInfo(Phone phone);
    boolean altPhoneInfo(Phone phone);
}
