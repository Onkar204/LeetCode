import java.sql.*;
class JDBCConnectiondemo
{
	public static void main(String args[])throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.print("Driver Load sucessfully");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","rodm");
		System.out.println("Connection sucessfully done");
		con.close();
	}
}