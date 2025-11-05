package com.shinhan.day10;
//어노테이션 만듦

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME) //언제까지 유지
@Target(ElementType.METHOD) //적용대상은?
public @interface PrintAnnotation {
    //PrintAnnotation에서 사용할수있는 속성들
    String value() default "-";

    int number() default 7;

    int number2() default 2;
}