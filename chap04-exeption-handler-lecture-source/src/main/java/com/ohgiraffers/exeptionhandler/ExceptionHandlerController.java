package com.ohgiraffers.exeptionhandler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExceptionHandlerController {


    @GetMapping("controller-null")
    public String nullPointerExceptionTest(){

        String str = null;
        System.out.println(str.charAt(0));

        return "/";
    }

    @ExceptionHandler(NullPointerException.class)
    public String nullPointExceptionHandler(NullPointerException exception){
        System.out.println("controller 레벨의 exception 처리");

        return "error/nullPoint";
    }

    @GetMapping("controller-user")
    public String userExceptionTest() throws MemberRegistException {
        boolean check = true;

        if (check){
            throw new MemberRegistException("저리 꺼져 이 문어야!!!!!!!!!!!!!");
        }
        return "/";
    }
    @ExceptionHandler(MemberRegistException.class)
    public String userExceptionHandler(Model model, MemberRegistException exception){
        System.out.println("controller 레벨의 exception 처리");

        model.addAttribute("exception", exception);

        return "error/memberRegist";
    }
}
