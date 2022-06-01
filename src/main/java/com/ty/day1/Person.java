package com.ty.day1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Person extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		PrintWriter printWriter = resp.getWriter();
		String sql = "<html><body><h1>welcome to Person</h1>\r\n"
				+ "<a href = \" http://localhost:8080/Servlets_App/deepak\"> click here</a>\r\n"
				+ "</body></html>";
		printWriter.write(sql);
	}

}
