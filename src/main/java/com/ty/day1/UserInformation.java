package com.ty.day1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class UserInformation extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String s1 = req.getParameter("NameUser");
		String s2 = req.getParameter("EmailUser");
		String s3 = req.getParameter("Phoneuser");
		String s4 = req.getParameter("PasswordUser");
		PrintWriter printWriter = res.getWriter();

		String html1 = "<html><body><h1>welcome to " + s1 + "</h1></body></html>";

		printWriter.write(html1);

		String html2 = "<html><body><h1>welcome to " + s2 + "</h1></body></html>";

		printWriter.write(html2);

		String html3 = "<html><body><h1>welcome to " + s3 + "</h1></body></html>";

		printWriter.write(html3);
		String html4 = "<html><body><h1>welcome to " + s4 + "</h1></body></html>";

		printWriter.write(html4);
	}

}
