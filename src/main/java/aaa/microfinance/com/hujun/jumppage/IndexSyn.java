package aaa.microfinance.com.hujun.jumppage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexSyn {
    @RequestMapping("/index")
    public String index(){
        System.out.println ("前台主页");
        return "/index";
    }
    @RequestMapping("/login")
    public String login(){
        System.out.println ("登录页面");
        return "/login";
    }
    @RequestMapping("/register")
    public String register(){
        System.out.println ("注册页面");
        return "/register";
    }
}
