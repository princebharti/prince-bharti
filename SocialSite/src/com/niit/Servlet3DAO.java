package com.niit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Servlet3DAO {

	
	boolean validate_forget_user(String username,int qno,String qa){
		boolean flag=false;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connect=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/socialsite","root","");	
			PreparedStatement smt=connect.prepareStatement("select * from info where username=?");
			smt.setString(1, username);
			ResultSet rs=smt.executeQuery();
			
			if(rs.next()){
				if(rs.getInt(10)==qno){
					if(rs.getString(11).equals(qa)){
						flag=true;
					}
					else
						flag=false;
				}
				else
					flag=false;
			}
			

			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		return flag;
	}
	
	
	
}
