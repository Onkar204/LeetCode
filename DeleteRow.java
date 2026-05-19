//delete Row 
import java.sql.*;
class DeleteRow
{
	public static void main(String args[])throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","rodm");
		Statement stmt=con.createStatement();
		int x=stmt.executeUpdate("delete from student where roll_no=11");
		System.out.println("No of deleted from table :"+x);
		con.close();
	}
}