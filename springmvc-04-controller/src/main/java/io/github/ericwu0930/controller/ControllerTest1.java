package io.github.ericwu0930.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author erichwu
 * @date 2020/5/3
 */
// 只要实现了Controller接口的类，说明这就是个控制器了
public class ControllerTest1 implements Controller {
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mv=new ModelAndView();
        mv.addObject("msg","controllerTest1");
        mv.setViewName("test");
        return mv;
    }
}
