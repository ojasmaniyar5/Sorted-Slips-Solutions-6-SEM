import java.sql.*;

public class Slip_11B {
	public static void main(String [] args) throws Exception 
	{
	Connection con;
	Statement st;
	String query;
	ResultSet rs;
	
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Assignments","root","mysql@db");

	st=con.createStatement();
	
	query="Select * from Product,Sales where Product.PID=Sales.Product_PID And Product.PID=101 And Sdate between '2022/05/20' and '2022/05/30';";
	
	rs=st.executeQuery(query);
	while(rs.next())
	{
	 System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4)+" "+rs.getInt(5)+" "+rs.getDate(7));
	}
	
	st.close();
	con.close();
	
	}
}