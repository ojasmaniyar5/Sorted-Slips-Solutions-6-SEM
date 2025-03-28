
import java.sql.*;

public class Slip_8A {
    public static void main(String[] args) throws Exception{
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Assignments","root","mysql@db");

        Statement stm = conn.createStatement();

        ResultSet rs = stm.executeQuery("SELECT * FROM Employee WHERE ename LIIKE 'A%';");

        System.out.println("Eno | Ename | Dept | Sal");
        while(rs.next()){
            System.out.println(rs.getInt("eno")+" | "+rs.getString("ename")+" | "+rs.getString("dept")+" | "+rs.getInt("sal"));
        }
    }    
}
