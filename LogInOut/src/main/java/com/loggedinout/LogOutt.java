package com.loggedinout;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
public class LogOutt extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		Cookie ck=new Cookie("name","");
		ck.setMaxAge(0);
		res.addCookie(ck);
		System.out.println("logout");
		
//		res.sendRedirect("MainFile.html");
		
		RequestDispatcher obj1=req.getRequestDispatcher("/MainFile.html");
		obj1.include(req, res);
		out.println("you are succesfully loggedout");
	}
}