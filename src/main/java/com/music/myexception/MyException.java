package com.music.myexception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.method.HandlerMethod;

/**
 * Created by jiang on 8/21/21 10:58 PM
 */
@ControllerAdvice
public class MyException {

    @ExceptionHandler(value = Exception.class)
    public String exceptionHandle(Exception e, HandlerMethod Method){
        System.out.println("method run here......");
        System.out.println(e);
        System.out.println(Method.getMethod().getName());
        return e.getMessage();
    }
}
