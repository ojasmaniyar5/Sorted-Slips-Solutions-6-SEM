<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Account</title>
</head>
<body>
<center>
<form method="post" action="Slip22B.jsp">
Enter ANo
<input type="text" name="t1"><br>
Enter AType
<input type="text" name="t2"><br>
Enter Balance
<input type="text" name="t3"><br>
<input type="submit">
</form>
</center>
</body>
</html>
<%
String s1=request.getParameter("t1");
String s2=request.getParameter("t2");
String s3=request.getParameter("t3");
if(s1!=null&&s2!=null&&s3!=null)
{
   int ano=Integer.parseInt(s1);
   
   int bal=Integer.parseInt(s3);
   String userName="root";
   String password="mysql@db";
   String url="jdbc:mysql://localhost:3306/Assignments";
   try
   {
	   Connection con=DriverManager.getConnection(url,userName,password);
	   Statement st=con.createStatement();
	   out.println("<tr><td>");
	   int k=st.executeUpdate("insert into account values("+ano+",'"+s2+"',"+bal+")");
	   if(k>=1)
		   out.println("<h1>Insert successfully");
	   ResultSet rs=st.executeQuery("select * from account");
	   out.println("<table border=1>");
	   while(rs.next())
	   {
		   out.println("<tr><td>"+rs.getInt(1));
		   out.println("<td>"+rs.getString(2));
		   out.println("<td>"+rs.getInt(3));
		   out.println("</tr>");
	   }
	   out.println("</table>");
	   
	   st.close();
	   con.close();
   }
   catch(Exception e)
   {
	   out.println(e);
   }
}
%>