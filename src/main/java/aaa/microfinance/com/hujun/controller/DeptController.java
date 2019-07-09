package aaa.microfinance.com.hujun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DeptController {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        System.out.println ("hello world");
        return "hello world";
    }
    @RequestMapping("/index")
    public String index(){
        System.out.println ("主页");
        return "/index.html";
    }
}
