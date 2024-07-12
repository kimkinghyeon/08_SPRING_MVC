package com.ohgiraffers.intercptor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/*")
public class MainController {

    @RequestMapping(value = {"/","/mein"})
    public String defaultLocation(){
        return "main";
    }
}
