package com.ohgiraffers.fileupload;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/*")
@Slf4j
public class MainController {
    @GetMapping(value = {"/","/main"})
    public String defaultLocation(){

        String name = "king";
        String job = "학생";

        System.out.println("룰루랄라");
        log.info("저는 {} 이고 {} 이라고 합니다.",name,job);
        return "main";
    }

}
