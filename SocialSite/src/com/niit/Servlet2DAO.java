package com.niit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Servlet2DAO {           // for register page

	
	public boolean validate_user(String username){
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connect=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/socialsite","root","");	
			PreparedStatement smt=connect.prepareStatement("select * from info where username=?");
			 smt.setString(1, username);
			 ResultSet rs=smt.executeQuery();
			 
			 if(rs.next()){
				 return false;
			 }
			 else{
				 return true;
			 }
			 
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		
		return false;
	}
	
	
	static int userid=0;
	
	
	public boolean insert(String firstname,String lastname,String address,String gender,String username,String password,int qno,String qa){
		
		userid++;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connect=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/socialsite","root","");	
			PreparedStatement smt=connect.prepareStatement("insert into info values(null,?,?,?,?,?,?,?,?,?,?)");
			 smt.setString(1, username);
			 smt.setString(2, password);
			 smt.setString(3, "user");
			 smt.setString(4, "true");
			 smt.setString(5,firstname);
			 smt.setString(6, lastname);
			 smt.setString(7, address);
			 smt.setString(8, gender);
			 smt.setInt(9, qno);
			 smt.setString(10, qa);
            if( smt.executeUpdate()!=0)
             return true;
             else
            	  return false;

			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	
	
	
	
	
	
}
