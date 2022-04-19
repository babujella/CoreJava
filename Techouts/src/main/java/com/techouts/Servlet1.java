package com.techouts;

import java.io.IOException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		 String i=req.getParameter("ID");
		 String j=req.getParameter("Name");
		 res.getWriter().println("Your name is :"+j);
		 res.getWriter().println("YourMail Id is:"+i);
		 res.getWriter().println("You are Logged in......");

	}
}
