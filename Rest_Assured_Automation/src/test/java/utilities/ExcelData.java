package utilities;

import java.util.HashMap;
import java.util.List;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class ExcelData {
	
	String filePath="C:\\Users\\SAMEER YALLA\\Desktop\\Madurai-Rameswaram Trip expenses.xlsx";
	
	public static void main(String args[])
	{
		ExcelData ed=new ExcelData();
		ed.Loadexceldata();
		//ed.CreateNewSheet();
		ed.insertData();	
		ed.UpdateExcelData(1);
	}
	
	public void Loadexceldata() {
	try {
		HashMap<String, List<String>> hs=new HashMap<String, List<String>>();
		Object[] obj=null;
		Fillo fillo=new Fillo();
		Connection con=fillo.getConnection("C:\\Users\\SAMEER YALLA\\Desktop\\Madurai-Rameswaram Trip expenses.xlsx");
		Recordset rs=con.executeQuery("select * from Sheet2");
		int rowcount=rs.getCount();
		System.out.println(rowcount);
		int i=0;
		obj=new Object[rowcount];
		while(rs.next())
		{
			obj[i]=rs.getField("Activity");
			System.out.println(obj[i]);
			i++;
		}
		rs.close();
		con.close();
		
		
	}catch(FilloException e)
	{
		e.printStackTrace();
	}catch (Exception e) {
		e.printStackTrace();
	}
}
	
	public void CreateNewSheet()
	{
		try {
			Fillo fillo=new Fillo();
			Connection con=fillo.getConnection(filePath);
			con.createTable("Sheet4",new String[] {"ID","First Name","Last Name","Age"});
			con.close();
			
		}catch(FilloException e)
		{
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void insertData()
	{
		try {
			String query1 = "INSERT INTO \"Sheet4\"(ID,\"First Name\",\"Last Name\",\"Age\") VALUES(6,'Zaheer','Khan',37)";
			String query2 = "INSERT INTO \"Sheet4\"(ID,\"First Name\",\"Last Name\",\"Age\") VALUES(7,'Asish','Nehra',37)";
			Fillo fillo=new Fillo();
			Connection con=fillo.getConnection(filePath);
			con.executeUpdate(query1);
			con.executeUpdate(query2);
			con.close();
		}catch(FilloException e)
		{
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void UpdateExcelData(int age)
	{
		try {
			String query = "UPDATE \"Sheet4\" SET ID='3' WHERE (ID=1 and \"First Name\"='MS' AND \"Last Name\"='Dhoni')";
		Fillo fillo=new Fillo();
		Connection con=fillo.getConnection(filePath);
		con.executeUpdate(query);
		con.close();
		
		}
		catch(FilloException e)
		{
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
	    	
	}

}
