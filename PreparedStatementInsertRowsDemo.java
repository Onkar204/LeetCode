import java.sql.*;
import java.util.*;
class PreparedStatementInsertRowsDemo
{
	public static void main(String args[])throws Exception
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver Loaded Successfully!!!");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","system","rodm");
			System.out.println("Connection Established Successfully!!!");
			PreparedStatement pstmt=con.prepareStatement("insert into student values(?,?,?)");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Student Roll No:");
			int rn=sc.nextInt();
			System.out.println("Enter Student Name:");
			String rm=sc.next();
			System.out.println("Enter Student Marks:");
			int mrks=sc.nextInt();
			pstmt.setInt(1,rn);
			pstmt.setString(2,rm);
			pstmt.setInt(3,mrks);
			int x=pstmt.executeUpdate();
			System.out.println(" No of Rows Inserted into table:"+x);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}