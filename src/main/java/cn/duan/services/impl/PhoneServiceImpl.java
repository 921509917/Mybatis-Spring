package cn.duan.services.impl;

import cn.duan.dao.PhoneDao;
import cn.duan.domain.Phone;
import cn.duan.services.PhoneService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhoneServiceImpl implements PhoneService {
    PhoneDao phoneDao;

    public void setPhoneDao(PhoneDao phoneDao) {
        this.phoneDao = phoneDao;
    }

    @Override
    public List<Phone> showPhoneInfo() {
        return phoneDao.queryPhoneInfo();
    }

    @Override
    public boolean addPhoneInfo(Phone phone) {
        int i = phoneDao.insertPhoneInfo(phone);
        if (i > 0)
            return true;
        return false;
    }

    @Override
    public Phone selectPhoneInfo(Integer id) {
        Phone phone = phoneDao.findPhoneInfo(id);
        if(phone == null){
            return null;
        }
        return phone;
    }

    @Override
    public boolean delPhoneInfo(Phone phone) {
        int i = phoneDao.delPhoneInfo(phone.getId());
        if (i > 0)
            return true;
        return false;
    }

    @Override
    public boolean altPhoneInfo(Phone phone) {
        int i = phoneDao.altPhoneInfo(phone);
        if (i > 0)
            return true;
        return false;
    }

}
