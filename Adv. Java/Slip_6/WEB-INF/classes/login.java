import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;


public class login extends HttpServlet
{
public void doGet(
HttpServletRequest req,
HttpServletResponse res) throws
IOException,ServletException
{
res.setContentType("text/html");
PrintWriter out=res.getWriter();

Cookie ca[]=req.getCookies();
if(ca==null)
{
out.println("First Visit");
Cookie visit=new Cookie("vcnt","1");
visit.setMaxAge(24*3600);
res.addCookie(visit);
}
else
{
int counter=Integer.parseInt(ca[0].getValue());
counter++; //3  "3"
out.println(counter +" Visit");
ca[0].setValue(Integer.toString(counter));
res.addCookie(ca[0]);
}
}
}