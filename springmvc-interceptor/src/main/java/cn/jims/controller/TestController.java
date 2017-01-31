package cn.jims.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Jims on 2017/1/31.
 */
@Controller
@RequestMapping("")
public class TestController {

    @RequestMapping("/viewAll")
    public ModelAndView viewAll(String name, String pwd) {
        ModelAndView mv = new ModelAndView();
        System.out.println("进入控制器的viewAll()方法...");
        System.out.println("name=" + name);
        System.out.println("pwd=" + pwd);
        mv.setViewName("hello");

        return mv;
    }

    @RequestMapping("/query")
    public ModelAndView query(String name, String pwd) {
        ModelAndView mv = new ModelAndView();
        System.out.println("进入控制器的query()方法...");
        System.out.println("name=" + name);
        System.out.println("pwd=" + pwd);
        mv.setViewName("hello2");
        mv.addObject("msg","helloworld!");
        return mv;
    }
}
