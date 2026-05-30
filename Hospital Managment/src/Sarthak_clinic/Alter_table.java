package Sarthak_clinic;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Alter_table {
	public static void main(String[] args)  {
		String url="jdbc:mysql://localhost:3306/mydata";
		String user="root";
		String password="root";
		
		// Alter table with prepared statements
		//String sql="Alter table Students add age INT";
		String s ="UPDATE Students SET age=? WHERE rollno=?";
		
		// Alter table with direct statements
		//String addcol="alter table students \r\n"
			//	+ "add address varchar(50)";
				
		String update101="update students \r\n"
				+ "set address=\"Pune\"\r\n"
				+ "where rollno=101";
		String update102="update students \r\n"
				+ "set address=\"Mumbai\"\r\n"
				+ "where rollno=102;";
		String update103="update students \r\n"
				+ "set address=\"Chennai\"\r\n"
				+ "where rollno=103;";
				
		
	try
	{
		// driver connection
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,user,password);
			System.out.println("Connection created");
		// create statement for query execution
			Statement stmt=con.createStatement();
		// call create query using statement
			
			//stmt.executeUpdate(sql);
			//System.out.println("New column age added");
			
			//stmt.executeUpdate(addcol);
			//System.out.println("new coloumn added");
			
			PreparedStatement ps = con.prepareStatement(s);
			ps.setInt(1, 23);
            ps.setInt(2, 101);
            ps.executeUpdate();
            ps.setDouble(1, 19);
            ps.setInt(2, 102);
            ps.executeUpdate();
            ps.setInt(1, 29);
            ps.setDouble(2, 103);
            ps.executeUpdate();
            
			int rowInserted=stmt.executeUpdate(update101);
			int rowInserted1=stmt.executeUpdate(update102);
			int rowInserted2=stmt.executeUpdate(update103);
			if(rowInserted>0)
			{
				System.out.println("new Student record inserted ");
			}
			
			//Print table
			ResultSet rs=stmt.executeQuery("Select * from students");
			System.out.println("rollno\t name\t\tPer\tEmail\t\t Age\tAddress");
			
			// while loop for fetching all the table records
			while(rs.next())
			{
				int rollno=rs.getInt("rollno");
				String name=rs.getString("name");
				int per=rs.getInt("per");
				String email=rs.getString("email");
				int age=rs.getInt("age");
				String address=rs.getString("address");
				System.out.println(rollno+"\t"+ name+"\t"+ per+"\t"+ email+"\t "+age+"\t"+address);
		
			}
			
			stmt.close();
			con.close();
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e);
		}
		
		
 
	}

}
