import java.io.*;

import java.net.*;

class Slip17B_Server

{

    public static void main(String args[]) throws IOException

    {

        try

        {

            ServerSocket server = new ServerSocket(7777);

            Socket s = server.accept();

            DataInputStream dis = new DataInputStream(s.getInputStream());

            DataOutputStream dos = new DataOutputStream(s.getOutputStream());

            String sfilename = dis.readUTF();

            File file = new File(sfilename);

            if (file.exists())

            {

                FileInputStream fin = new FileInputStream(sfilename);

                int ch;

                String fileinfo = "";

                while ((ch = fin.read()) != -1)

                {

                    fileinfo = fileinfo + (char) ch;

                }

                System.out.println(fileinfo);

                dos.writeUTF(fileinfo);

            }

            else

                dos.writeUTF("0");

        }

        catch (Exception e) {
        }

    }

}