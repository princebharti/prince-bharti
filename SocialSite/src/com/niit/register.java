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

@WebServlet("/register")
public class register extends HttpServlet {
	private static final long serialVersionUID = 1L;
    

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		RegisterDAO ob=new RegisterDAO();
		PrintWriter out=response.getWriter();
		HttpSession s=request.getSession();
		
		String newPassword=request.getParameter("newpassword");
		String confirmPassword=request.getParameter("confirmpassword");
		
		String username=(String)s.getAttribute("user_n");

		
		
		if(ob.updatePassword(newPassword, confirmPassword, username)){
			request.setAttribute("user", username);
			response.setContentType("text/html");
			out.println("your password has been updated");
			RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
			rd.include(request, response);

			
		}
		else{
			
			
			out.println("your password has not been updated please try again");
			RequestDispatcher rd=request.getRequestDispatcher("resetpassword.jsp");
			rd.include(request,response);
			
			
		}
		
		
		
	}

	

}
