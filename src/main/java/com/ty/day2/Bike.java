package com.ty.day2;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Bike extends HttpServlet
{
  @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	  ServletContext context = getServletContext();
	  
	  String rt = context.getInitParameter("RoadTax");
	  
    ServletConfig config = getServletConfig();
    String hl = config.getInitParameter("Helmet");
    
    System.out.println("Road tax is :"+rt);
    System.out.println("helmet :"+hl);
}
}
