package com.niit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Servlet1DAO {

	public flag validate(String username,String password){
		
		flag ob=new flag();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connect=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/socialsite", "root", "");	
			PreparedStatement smt=connect.prepareStatement("select * from info where username=?");
			 smt.setString(1, username);
			 ResultSet rs=smt.executeQuery();
			 
			 if(rs.next()){
				 ob.flag_user=true;
				 if(rs.getString(3).equals(password)){
					 ob.flag_pass=true;
				 }
				 else
					 ob.flag_pass=false;//username and password matches
			 }
			 else{
                 ob.flag_user=false;        //username is not valid
			 
			 }
			

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		return ob;
		
	}
}
	
