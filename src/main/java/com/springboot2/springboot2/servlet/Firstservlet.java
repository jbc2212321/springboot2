package com.springboot2.springboot2.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "FirstServlet", urlPatterns = "/first")
public class Firstservlet extends HttpServlet {
    @Override
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        super.service(req, res);
//        System.out.println("Hello Servlet!");
        String method =req.getMethod();
//        System.out.println("当前请求是:"+method);
//        if ("GET".equals(method)){
//            doGet(req,res);
//        }else {
//            doPost(req,res);
//        }
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("First Servlet......");
        ServletContext servletContext=getServletContext();
//        System.out.println(servletContext);
//        System.out.println(servletContext.getInitParameter("name"));
//        System.out.println(servletContext.getContextPath());//获取当前路径
//        System.out.println(servletContext.getRealPath("/a.html"));

        servletContext.setAttribute("abc","保存的值");
        System.out.println(servletContext.getAttribute("abc"));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
        System.out.println("这是post请求");
    }
}
//http://localhost:8080/first