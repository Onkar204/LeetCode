import java.sql.*;
import java.util.*;
public class DBProject
{
	public static void main(String args[])throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver Loaded Sucessfully");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","rodm");
		System.out.println("\nConnection Established sucessfully");
		int ch;
		Scanner sc= new Scanner(System.in);
		Statement stmt=con.createStatement();
		do{
			System.out.println("\n*******Database Connectivity******");
			System.out.println("\n1.Create Table");
			System.out.println("\n2.insert into Table");
			System.out.println("\n3.delete from Table");
			System.out.println("\n4.Update into Table");
			System.out.println("\n5.Fetch Table");
			System.out.println("\n6.Exit");
			System.out.println("\nEnter Your Choice");
		 ch=sc.nextInt();
			switch(ch)
			{
				case 1:Boolean x=stmt.execute("create table Employee1(emp_id number,emp_name varchar(20))");
					   if(x==false)
					   {
						   System.out.println("Table created Sucessfully");
					   }
					   else
					   {
							System.out.println("Something Went Wrong");
					   }
					   break;
				case 2:stmt.execute("insert into Employee1 values(1010,'dennis')");
						System.out.println("Row inserted Sucessfully");
						break;
				case 3:stmt.execute("delete from Employee1 where emp_id='1010'");
						System.out.println("Row deleted Sucessfully");
						break;
				case 4:stmt.execute("update Employee1 set emp_name='James' where emp_id='1010'");
						System.out.println("Row updated Sucessfully");
						break;
				case 5:ResultSet rs=stmt.executeQuery("select *from Employee1");
						System.out.println("Emp_id\tEmp_name");
						System.out.println("======================");
						while(rs.next())
						{
							System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
						}
						break;
				case 6:System.out.println("Thanks");
						break;
				default:System.out.println("Invalid choice");
			}
			}while(ch!=6);
			con.close();
		
	}
}
	