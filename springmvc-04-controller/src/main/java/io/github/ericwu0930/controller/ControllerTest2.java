package io.github.ericwu0930.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author erichwu
 * @date 2020/5/3
 */


@Controller  //代表这个类会被spring接管 被该注解的类中的所有方法，如果返回值是String
// 并且有具体页面可以跳转，那么就会被视图解析器解析。
public class ControllerTest2 {

    @RequestMapping("/test")
    public String test1(Model model){
        model.addAttribute("msg","ControllerTest2");
        return "test";     //去找WEB-INF/jsp/test.jsp
    }
}
