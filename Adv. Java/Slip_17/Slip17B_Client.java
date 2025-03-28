import java.io.*;

import java.net.*;

import java.util.*;

public class Slip17B_Client

{

    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) throws IOException

    {

        try

        {

            Socket client = new Socket("localhost", 7777);

            DataInputStream dis = new DataInputStream(client.getInputStream());

            DataOutputStream dos = new DataOutputStream(client.getOutputStream());

            System.out.println("pls enter a file name");

            String cfilename = sc.next();

            dos.writeUTF(cfilename);

            String msg = dis.readUTF();

            if (msg.equalsIgnoreCase("0"))

                System.out.println("File does not exists");

            else

                System.out.println(msg);

        }

        catch (Exception e) {
        }

    }

}