package com.ty.day2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Teacher extends HttpServlet {
	static {
		System.out.println("teacher object loaded into the memory");
	}
	{
		System.out.println("teacher servlet instainted");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("teacher object init");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("teacher object is treggred");
	}
//   @Override
//    public void destroy() {
//	System.out.println("teacher object is destory");
//}
	
}
