package com.ohgiraffers.handlermethod;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;

@Controller
@RequestMapping("/first/*")
public class FirstController {

    /*
    컨트롤러 핸들러 메서드의 반환 값을 void 로 설정하면 요청 주소가 view 의 이름이 된다.
    => /first/regist 요청이 들어오면 /first/reigst 뷰를 응답한다.
    * */

    // 페이지 이동용 핸들러 메소드
    @GetMapping("regist")
    public void regist() {}

    /*
    WebRequest 로 요청 파라미터 전달 받기
    파라미터 선언부에 WebRequest 타입을 선언하면 해당 메소드 호출 시 인자로 값을 전달해준다.
    HttpServletRequest, HttpServletResponse / servletRequest, ServletResponse 가능하다.
    * */
    @PostMapping("regist")
    public String registMenu(Model model, WebRequest request){
        String name = request.getParameter("name");
        int price = Integer.parseInt(request.getParameter("price"));
        int categoryCode = Integer.parseInt(request.getParameter("categoryCode"));

        System.out.println("name = " + name);
        System.out.println("price = " + price);
        System.out.println("categoryCode = " + categoryCode);

        String message = name + "을(를) 신규 메뉴 목록의" + categoryCode + "번 카테고리에" + price + "원으로 등록 하셨습니다.";

        model.addAttribute("message",message);

        return "first/messagePrinter";
    }
}
