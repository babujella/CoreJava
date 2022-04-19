package com.techouts;

import java.io.IOException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Request2 extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		String name=req.getParameter("Name");
		res.getWriter().println("Welcome broooo");
	}
}
