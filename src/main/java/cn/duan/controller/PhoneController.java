package cn.duan.controller;

import cn.duan.domain.Phone;
import cn.duan.exception.*;
import cn.duan.services.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.List;

@Controller
public class PhoneController {
    public static String config = "applicationContext.xml";

    @Autowired
    private PhoneService phoneService;

    @RequestMapping(value = "/show/show.do")
    public ModelAndView doShow() throws MyPhoneException {
        ModelAndView modelAndView = new ModelAndView();
        List<Phone> phoneList = phoneService.showPhoneInfo();
        if (phoneList == null)
            throw new PhoneException("信息获取失败");
        modelAndView.addObject("phoneList",phoneList);
        modelAndView.setViewName("select");
        return modelAndView;
    }

    @RequestMapping(value = "/show/insertInfo.do",method = RequestMethod.POST)
    public ModelAndView doInsert(Integer id,String brand,String memory,String color,Double price) throws MyPhoneException, IOException {
        ModelAndView modelAndView = new ModelAndView();
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        PhoneService phoneService = (PhoneService) ctx.getBean("phoneService");
        if (id == null) {
            throw new NullException("编号不能为空");
        }
        Phone phone = new Phone(id,brand,memory,color,price);
        if (phoneService.selectPhoneInfo(id) != null){
            throw new NullException("编号已存在");
        }
        boolean flag = phoneService.addPhoneInfo(phone);
        System.out.println(flag);
        if (flag){
            modelAndView = doShow();
        }
        
        return modelAndView;
    }
    @RequestMapping(value = "/show/delInfo.do",method = RequestMethod.POST)
    public ModelAndView doDel(Integer id, String brand, String memory, String color, Double price) throws MyPhoneException {
        String config = "applicationContext.xml";
        ModelAndView modelAndView = new ModelAndView();
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        PhoneService phoneService = (PhoneService) ctx.getBean("phoneService");
        if (id == null) {
            throw new DelException("编号不能为空");
        }
        Phone phone = new Phone(id,brand,memory,color,price);
        if (phoneService.selectPhoneInfo(id) == null){
            throw new DelException("手机不存在");
        }
        boolean flag = phoneService.delPhoneInfo(phone);
        if (flag){
            modelAndView = doShow();
        }
        return modelAndView;
    }
    @RequestMapping(value = "/show/alterInfo.do",method = RequestMethod.POST)
    public ModelAndView doAlt(Integer id,String brand,String memory,String color,Double price) throws MyPhoneException {
        ModelAndView modelAndView = new ModelAndView();
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        PhoneService phoneService = (PhoneService) ctx.getBean("phoneService");
        if (id == null) {
            throw new AltException("编号不能为空");
        }
        Phone phone = new Phone(id,brand,memory,color,price);
        if (phoneService.selectPhoneInfo(id) == null){
            throw new AltException("手机不存在");
        }
        boolean flag = phoneService.altPhoneInfo(phone);
        if (flag){
            modelAndView = doShow();
        }
        return modelAndView;
    }
}
