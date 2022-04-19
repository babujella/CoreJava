package com.loggedinout;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class S1 extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		res.setContentType("text/html");
		String name=req.getParameter("name");
		String Password=req.getParameter("password");
		if(Password.equals("babu")) {
			res.getWriter().println("You are logged into this Site"+"  "+name);
			Cookie ck=new Cookie("name",name);
			res.addCookie(ck);
		}
		else {
			res.getWriter().println("<h3>Sorry credentials are Wrong</h3>");
			RequestDispatcher obj=req.getRequestDispatcher("/MainFile.html");
			obj.include(req, res);

		}
	}
}
