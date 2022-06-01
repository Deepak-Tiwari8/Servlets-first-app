package com.ty.day1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Myrequest extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
   String n = req.getParameter("nm");
   PrintWriter printWriter = res.getWriter();
   String htmlcode = "<html><body><h1>welcome to "+n+"</body></html>";
   printWriter.write(htmlcode);
	}

}
