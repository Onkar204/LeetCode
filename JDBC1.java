import java.sql.*;
class JDBC1
{
	public static void main(String args[])throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","rodm");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select *from student");
		System.out.println("Roll no\t name");
		System.out.println("=====================");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2));
		}
		con.close();
	}
		
}