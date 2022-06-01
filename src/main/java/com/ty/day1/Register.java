package com.ty.day1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Register extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String s1 = req.getParameter("UserName");
		String s2 = req.getParameter("UserEmail");
		String s3 = req.getParameter("UserPhone");
		String s4 = req.getParameter("gender");
		String s5 = req.getParameter("UserPassword");
		String s6 = req.getParameter("Country");

		PrintWriter printWriter = res.getWriter();

		String html1 = "<html><body><h1> UserName :: " + s1 + "</h1></body></html>";

		printWriter.write(html1);

		String html2 = "<html><body><h1> UserEmail :: " + s2 + "</h1></body></html>";

		printWriter.write(html2);

		String html3 = "<html><body><h1> UserPhone :: " + s3 + "</h1></body></html>";

		printWriter.write(html3);
		
		String html4 = "<html><body><h1> UserGender ::" + s4 + "</h1></body></html>";

		printWriter.write(html4);

		String html5 = "<html><body><h1> UserPassword :: " + s5 + "</h1></body></html>";

		printWriter.write(html5);
		
		String html6 = "<html><body><h1> UserCountry :: " + s6 + "</h1></body></html>";

		printWriter.write(html6);

	}

}
