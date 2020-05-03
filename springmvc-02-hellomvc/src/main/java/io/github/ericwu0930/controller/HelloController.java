package io.github.ericwu0930.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author erichwu
 * @date 2020/5/3
 */
public class HelloController implements Controller {
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        //业务代码
        String res="Hello,SpringMVC";
        modelAndView.addObject("msg",res);
        //视图跳转
        modelAndView.setViewName("test");
        return modelAndView;
    }
}
