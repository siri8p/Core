package org.sirisha;
import java.sql.*;


public class Demo {

	public static void main(String[] args)throws Exception {
		String url ="jdbc:mysql://localhost:3306/aliens";
		String uname ="root";
		String pass= "root";
		int useid =6;
		String username ="kasu";
		String query ="insert into student values(?,?)";
	    Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
	PreparedStatement st =con. prepareStatement(query);
		 st.setInt(1,useid);
		 st.setString(2, username);
	  int count =st.executeUpdate();
	
	System.out.println(count +"rows affected");
		st.close();
		con.close();
		
	}
	

}
