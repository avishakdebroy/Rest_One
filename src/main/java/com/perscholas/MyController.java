package com.perscholas;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("home")
public class MyController {

    @RequestMapping("/login")
    public String showLogin() {
        return "inboxpage";
    }

    @RequestMapping("/")
    public String simpleMethod() {
        return "inboxpage";
    }

    @RequestMapping("/index")
    public String showIndex() {
        return "inboxpage";
    }
    @GetMapping("/javaindex")
    public String showJavaMethod() {
        return "javaindex";
    }

}
