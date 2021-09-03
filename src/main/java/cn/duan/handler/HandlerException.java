package cn.duan.handler;

import cn.duan.exception.*;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HandlerException implements HandlerExceptionResolver {
    @ExceptionHandler(LoginException.class)
    public ModelAndView resolveException(HttpServletRequest httpServletRequest,
                                         HttpServletResponse httpServletResponse, Object o, Exception e) {
       ModelAndView mv = new ModelAndView();
        if (e instanceof RegistException){
            mv.setViewName("registError");
        }else  if (e instanceof NullException){
            mv.addObject("tipsAdd",e.getMessage());
            mv.setViewName("phoneError");
        } else  if (e instanceof DelException){
            mv.addObject("tipsDel",e.getMessage());
            mv.setViewName("phoneError");
        } else  if (e instanceof AltException){
            mv.addObject("tipsAlt",e.getMessage());
            mv.setViewName("phoneError");
        }else {
            System.out.println(e.getMessage());
            mv.addObject("tips","需要提示的信息");
            mv.setViewName("otherError");
        }
        mv.setViewName("loginError");
        return mv;
    }
}
