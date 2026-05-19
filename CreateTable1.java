//table Creation
import java.sql.*;
class CreateTable1
{
	public static void main(String args[])throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","rodm");
		Statement stmt=con.createStatement();
		boolean x=stmt.execute("create table employees1(empid int,empname varchar(20))");
		if(x==false)
		{
		System.out.println("Table Created Sucessfully");
		}
		else
		{
			System.out.println("Table Not Created ");
		}
		
		con.close();
	}
	
}