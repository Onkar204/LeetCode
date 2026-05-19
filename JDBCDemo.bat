import java.sql.*;
class JDBCDemo
{
 public static void main(String args[])throws SQLException
 {
 try
 {
 //Register Driver
 Class.forName("oracle.jdbc.driver.OracleDriver");
 //Example to establish connection with the Oracle database
 Connection con=DriverManager.getConnection("jdbc:oracle:thin:
 @localhost:1521:xe","system","password");
 //Create Statement Object
 Statement stmt=con.createStatement();
 ResultSet rs=stmt.executeQuery("select *from Student");
 while(rs.next())
 {
 System.out.println(re.getInt(1)+" "+rs.getString(2));
 }
 //Close The Connection
 con.close();
 }
 catch(Exception e)
 {
 System.out.println(e);
 }
 }
}