//update Query
import java.sql.*;
class UpdateQuery
{
	public static void main(String args[])throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","rodm");
		Statement stmt=con.createStatement();
		int x=stmt.executeUpdate("update student set name='om' where Roll_No=11");
		System.out.println("No of row updated from table :"+x);
		con.close();
	}
}