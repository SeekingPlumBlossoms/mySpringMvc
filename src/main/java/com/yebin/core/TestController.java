package com.yebin.core;

import com.yebin.annotation.MyController;
import com.yebin.annotation.MyRequestMapping;
import com.yebin.annotation.MyRequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 17611
 * @version 1.0
 * @className TestController
 * @description 测试controller
 * @date 2019/4/9 13:44
 **/
@MyController
@MyRequestMapping("/test")
public class TestController {

    @MyRequestMapping("/doTest")
    public void test1(HttpServletRequest request, HttpServletResponse response,
                      @MyRequestParam("param") String param,
                      @MyRequestParam("param2") String param2,
                      @MyRequestParam("param3") Integer param3 ){
        try {
            response.getWriter().write( "doTest method success! param:"+param+param2+param3);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @MyRequestMapping("/doTest2")
    public void test2(HttpServletRequest request, HttpServletResponse response){
        try {
            response.getWriter().println("doTest2 method success!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
