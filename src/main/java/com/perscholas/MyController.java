package com.perscholas;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("home")

public class MyController {
    @RequestMapping("/login")
    public String login() {
        return "";
    }


}
