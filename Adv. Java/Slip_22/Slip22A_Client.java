import java.io.*;
import java.net.*;

class Slip22A_Client
{
	public static void main(String[] a)throws IOException
	{
		Socket st=new Socket("localhost",5917);
		DataInputStream dis=new DataInputStream(st.getInputStream());
		String d=dis.readUTF()+"";
		System.out.println("date:"+d);
	}

}