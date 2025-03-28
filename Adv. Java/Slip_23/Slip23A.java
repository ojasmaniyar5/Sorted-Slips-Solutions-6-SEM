import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class Slip23A extends JFrame {
    private JTable table;

    public CollegeDetailsApp() {
        setTitle("College Details");
        setSize(500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Column names
        String[] columnNames = {"CID", "CName", "Address", "Year"};

        // Create a table model
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columnNames);

        // Create a JTable using the model
        table = new JTable(model);

        // Add the table to a scroll pane
        JScrollPane scrollPane = new JScrollPane(table);
        getContentPane().add(scrollPane);

        setVisible(true);

        // Fetch data from the database
        fetchDataFromDatabase(model);
    }

    private void fetchDataFromDatabase(DefaultTableModel model) {
        // Database connection parameters
        try {
            // Establish connection
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Assignments","root","mysql@db");

            // Create a statement
            Statement statement = connection.createStatement();

            // Execute a query to fetch data
            ResultSet resultSet = statement.executeQuery("SELECT * FROM college");

            // Process the result set and populate the table model
            while (resultSet.next()) {
                Object[] rowData = {
                        resultSet.getInt("CID"),
                        resultSet.getString("CName"),
                        resultSet.getString("Address"),
                        resultSet.getInt("Year")
                };
                model.addRow(rowData);
            }

            // Close resources
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Run the application
        SwingUtilities.invokeLater(() -> new Slip23A());
    }
}