package com.DBMS;

import javax.swing.*;
import java.awt.event.*;
import java.sql.*;


public class INsertData extends JFrame implements ActionListener {
    private JLabel C1, C2, C3,C4,C5,C6;
    private JTextField CF1, CF2, CF3,CF4,CF5,CF6;
    private JButton insertButton;

    public INsertData() {

        C1 = new JLabel("AttendeeID: ");
        CF1 = new JTextField(10);
        C2 = new JLabel("FirstName: ");
        CF2 = new JTextField(10);
        C3 = new JLabel(", LastName: ");
        CF3 = new JTextField(10);
        C4 = new JLabel("Email: ");
        CF4 = new JTextField(10);
        C5 = new JLabel("PhoneNumber:");
        CF5 = new JTextField(10);
        C6 = new JLabel("RegistrationDate: ");
        CF6 = new JTextField(10);
        insertButton = new JButton("Insert");
        insertButton.addActionListener(this);

        JPanel panel = new JPanel();
        panel.add(C1);
        panel.add(CF1);
        panel.add(C2);
        panel.add(CF2);
        panel.add(C3);
        panel.add(CF3);
        panel.add(C4);
        panel.add(CF4);
        panel.add(C5);
        panel.add(CF5);
        panel.add(C6);
        panel.add(CF6);
        panel.add(insertButton);
        getContentPane().add(panel);

        // Set up the frame
        setTitle("Insert Data");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
    

    public void actionPerformed(ActionEvent e) {
        try {
        	 String url = "jdbc:mysql://localhost:3306/EventManage";
             String username = "root";
             String password = "Vivek_007";
            Connection conn = DriverManager.getConnection(url, username, password);

            String sql = "INSERT INTO Attendee (AttendeeID, FirstName, LastName, Email, PhoneNumber, RegistrationDate) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            String column1Value = CF1.getText();
            String column2Value = CF2.getText();
            String column3Value = CF3.getText();
            String column4Value = CF4.getText();
            String column5Value = CF5.getText();
            String column6Value = CF6.getText();

            pstmt.setString(1, column1Value);
            pstmt.setString(2, column2Value);
            pstmt.setString(3, column3Value);
            pstmt.setString(1, column4Value);
            pstmt.setString(2, column5Value);
            pstmt.setString(3, column6Value);

            pstmt.executeUpdate();
            pstmt.close();
            conn.close();
            JOptionPane.showMessageDialog(this, "Data inserted successfully!");
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error inserting data.");
        }
    }

    public static void main(String[] args) {
        new INsertData();
    }
}
