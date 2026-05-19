import java.sql.*;
public class selectfromtable
{
	public static void main(String args[])throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver Loaded Sucessfully");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","rodm");
		System.out.println("\nConnection Established Sucessfully");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select *from Student");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
		}
		con.close();
		
	}
}