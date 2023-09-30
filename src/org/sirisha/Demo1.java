package org.sirisha;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo1 {

		public static void main(String[] args)throws Exception {
			String url ="jdbc:mysql://localhost:3306/aliens";
			String uname ="root";
			String pass= "root";
			String query ="select* from student";
		    Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,uname,pass);
			Statement st =con.createStatement();
			ResultSet rs =st.executeQuery(query);
			String userdata ="";
			//rs.next();
			// userdata  =rs.getInt(1)+":" +rs.getString(2);
			//System.out.println(userdata);
			
			//rs.next();
		   // userdata  =rs.getInt(1)+":" +rs.getString(2);
			//System.out.println(userdata);
			  while(rs.next())
			  {
				 userdata =rs.getInt(1)+":"+rs.getString(2);
				 System.out.println(userdata);
			  }
			st.close();
			con.close();
			
		
    		
	}

}

