package cn.duan.controller;

import cn.duan.domain.User;
import cn.duan.exception.LoginException;
import cn.duan.exception.MyUserException;
import cn.duan.exception.RegistException;
import cn.duan.services.UserServices;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
    @RequestMapping(value = "/some.do",method = RequestMethod.POST)
    public String doSome(String username, String password) throws MyUserException {
        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        UserServices userServices = (UserServices) ctx.getBean("userService");
        User user = new User(username.trim(),password.trim());
        boolean flag = userServices.queryUser(user);
        if (!flag)
            throw new LoginException();
        return "redirect:/show/interface.jsp";
    }
    @RequestMapping(value = "/regist/regist.do",method = RequestMethod.POST)
    public String doRegist(String username,String password) throws MyUserException {
        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        UserServices userServices = (UserServices) ctx.getBean("userService");
        User user = new User(username.trim(),password.trim());
        boolean flag = userServices.queryUser(user);
        if (flag)
            throw new RegistException("用户已存在");
        int i = userServices.addUser(user);
        if (i < 0)
            throw new LoginException("注册失败");
        return "redirect:../index.jsp";
    }
}
