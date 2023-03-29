package Day10PKG;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample1 {

	public static void main(String[] args)  {

          
		 try {
		//create connection
		   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/pdborcl","hr","hr");//we have to provide url for connection
		   
		   //Create sql Query/statement
		   
		  
			Statement stmt=con.createStatement();
			String s="Select groupid,Payref,amount,batchrefno,pymtstatus from PYMT_TRANS";
			ResultSet rs=stmt.executeQuery(s);
			while(rs.next())
			{
				String grpid=rs.getString("groupid");
				String payref=rs.getString("payref");
				String batchref=rs.getString("batchrefno");
				int status=rs.getInt("pymtstatus");
				
			}
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   

	}

}
