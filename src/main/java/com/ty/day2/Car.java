package com.ty.day2;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Car extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext context = getServletContext();

		String rt = context.getInitParameter("RoadTax");

		ServletConfig config = getServletConfig();
		String sb = config.getInitParameter("SeatBelt");

		System.out.println("Road tax is :" + rt);
		System.out.println("Seat belt :" + sb);
	}
}
