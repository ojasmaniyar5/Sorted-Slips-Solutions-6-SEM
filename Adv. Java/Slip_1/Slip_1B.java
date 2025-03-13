import java.awt.*;
import java.io.*;
import java.net.*;
import javax.swing.*;

public class Slip_1B {
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame("Server");
        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        frame.add(new JScrollPane(textArea), BorderLayout.CENTER);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        ServerSocket serverSocket = new ServerSocket(12345);
        textArea.append("Waiting for client...\n");
        Socket socket = serverSocket.accept();
        textArea.append("Client connected!\n");
        
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        
        while (true) {
            String msg = in.readLine();
            if (msg == null) break;
            textArea.append("Client: " + msg + "\n");
        }
        socket.close();
        serverSocket.close();
    }
}
