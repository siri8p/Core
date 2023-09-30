package org.sirisha;
import java.sql.*;

public class Demo3 {

	public static void main(String[] args) throws Exception{
		String url ="jdbc:mysql://localhost:3306/aliens";
		String uname ="root";
		String pass= "root";
		String query ="insert into student values(5 ,'paderthi')";
	    Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		Statement st =con.createStatement();
		int count  =st.executeUpdate(query);
		
		System.out.print(count +"rows affected");
		st.close();
		con.close();
		
	}

}
