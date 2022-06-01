package com.ty.day2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Student extends HttpServlet
{
   @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
   String name = req.getParameter("NameStudent");
   String email = req.getParameter("EmailStudent");
   
   PrintWriter printWriter = resp.getWriter();
   
   String html1 = "<html><body><h1>welcome "+name+"</h1></body></html> ";
   printWriter.write(html1);
   
   String html2 = "<html><body><h1>welcome "+email+"</h1></body></html> ";
   printWriter.write(html2);
   
   
   }
}
