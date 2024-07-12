package com.ohgiraffers.exeptionhandler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OtherController {


    @GetMapping("other-controller-null")
    public String otherNullPointerExceptionTest(){

        String str = null;
        System.out.println(str.charAt(0));

        return "/";
    }

    @GetMapping("other-controller-user")
    public String otherUserExceptionTest() throws MemberRegistException {
        boolean check = true;

        if (check){
            throw new MemberRegistException("저리 꺼져 이 문어야!!!!!!!!!!!!!");
        }
        return "/";
    }

    @GetMapping("other-controller-array")
    public String otherArrayException(){
        double[] array =new double[1];
        System.out.println(array[3]);
        return "/";
    }
}
