package com.ohgiraffers.handlermethod;

/*
DTO 를 커맨드 객체로 이용하기 위해서는 form 의 name 과 값이 일치하게 만들어야한다.
* */

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
// 커멘드 객체는 기본 생성자를 이용해서 인스턴스를 만들기 때문에
// 기본 생성자가 반드시 필요함
@Getter
@Setter // 요청 파라미터 name 과 일치하는 필드의 Setter 를 이용하기 때문에,
// 네이밍룰에 맞는 setter 메소드가 작성되어야한다.
@ToString
public class MenuDTO {

    private String name;
    private int price;
    private int categoryCode;
    private String orderableStatus;
}
