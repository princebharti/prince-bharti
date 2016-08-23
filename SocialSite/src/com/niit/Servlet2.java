package com.niit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		Servlet2DAO ob=new Servlet2DAO();
		PrintWriter out=response.getWriter();
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String confirmpassword=request.getParameter("confirmpassword");
		String firstname=request.getParameter("firstname");
		String lastname=request.getParameter("lastname");
		String address=request.getParameter("address");
		String gender=request.getParameter("gender");
		int qno=Integer.parseInt(request.getParameter("qno"));
		String qa=request.getParameter("qa");
		
		if(ob.validate_user(username))
		{
		    if(password.equals(confirmpassword)){
		    if(ob.insert( firstname, lastname, address, gender,username,password,qno,qa));
		    {
		    		out.print("you have been successfully registered");
				response.setContentType("text/html");
				RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
				rd.include(request,response);
		    }

		    		
		    	
		    }else{
		    	 out.println("password do not matches");
			 response.setContentType("text/html");
			 RequestDispatcher rd=request.getRequestDispatcher("register.jsp");
		     rd.include(request,response);
		    }
			
			
		}
		else{
			out.println("user with this username already exist please choose different username !!");
			response.setContentType("text/html");

			RequestDispatcher rd=request.getRequestDispatcher("register.jsp");
			rd.include(request,response);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
