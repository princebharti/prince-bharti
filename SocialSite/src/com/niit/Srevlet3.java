package com.niit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
 
@WebServlet("/Servlet3")       //for forgetpassword.jsp
public class Srevlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String username=request.getParameter("username");
		int qno=Integer.parseInt(request.getParameter("qno"));
		String qa=request.getParameter("qa");
		PrintWriter out=response.getWriter();


		
		Servlet3DAO ob=new Servlet3DAO();
		boolean flag=ob.validate_forget_user(username, qno, qa);
		
		if(flag){
			
			request.setAttribute("user", username);
			response.setContentType("text/html");
			RequestDispatcher rd=request.getRequestDispatcher("resetpassword.jsp");
			rd.forward(request, response);
			
		}
		else{
			out.println("<h1><font color='red'>username,hint or ans is incorrect</font></h1>");
			response.setContentType("text/html");
			RequestDispatcher rd=request.getRequestDispatcher("forgetpassword.jsp");
			rd.include(request, response);
			
			
		}
		
		
	}
}


