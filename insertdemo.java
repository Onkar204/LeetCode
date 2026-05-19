//insert Query
import java.sql.*;
class insertdemo
{
	public static void main(String args[])throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","rodm");
		Statement stmt=con.createStatement();
		int x=stmt.executeUpdate("insert into employee values(10,'rahul')");
		System.out.println("Number Of row inserted :"+x);
		con.close();
	}
}