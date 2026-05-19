import java.sql.*;
public class CreateTable
{
	public static void main(String args[])throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver Loaded Sucessfully");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","rodm");
		System.out.println("connection Established Sucessfully");
		Statement stmt=con.createStatement();
		Boolean x=stmt.execute("create table (emp_id number,emp_name varchar(20))");
		if(x==false)
		{
			System.out.println("table Created Sucessfully");
		}
		else
		{
			System.out.println("Something went wrong");
		}
		con.close();
	}
	
}