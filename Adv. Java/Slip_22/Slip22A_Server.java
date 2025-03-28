import java.io.*;
import java.net.*;
import java.util.*;

class Slip22A_Server
{
	public static void main(String[] a)throws IOException
	{
		ServerSocket st=new ServerSocket(5917);
		Socket s= st.accept();
		DataOutputStream dos=new DataOutputStream(s.getOutputStream());
		Date d=new Date();
		System.out.println("date:"+d);
		dos.writeUTF(d+"");
	}

}