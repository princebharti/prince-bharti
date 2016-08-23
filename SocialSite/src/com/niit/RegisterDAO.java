package com.niit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class RegisterDAO {

	
public	boolean updatePassword(String newPassword,String confirmPassword,String username){
		
		
		if(newPassword.equals(confirmPassword)){
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection connect=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/socialsite", "root", "");
				
				PreparedStatement st=connect.prepareStatement("update info set password=? where username=?");
				st.setString(1,newPassword);
				st.setString(2, username);
				st.executeUpdate();

			} catch (ClassNotFoundException |SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return true;
	}else 	
		return false;
	}
	
	
}
