package com.DBMS;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;


public class InsertAttendeeEventForm extends JFrame {
    
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField attendeeIDField;
    private JTextField eventIDField;
    private JButton insertButton;
    
    public InsertAttendeeEventForm() {
        super("Insert Attendee-Event Record");
        
        // Initialize GUI components
        JLabel attendeeIDLabel = new JLabel("Attendee ID:");
        attendeeIDField = new JTextField(10);
        JLabel eventIDLabel = new JLabel("Event ID:");
        eventIDField = new JTextField(10);
        insertButton = new JButton("Insert");
        
        // Add components to form
        JPanel formPanel = new JPanel(new GridLayout(3, 2, 5, 5));
        formPanel.add(attendeeIDLabel);
        formPanel.add(attendeeIDField);
        formPanel.add(eventIDLabel);
        formPanel.add(eventIDField);
        formPanel.add(new JLabel());
        formPanel.add(insertButton);
        add(formPanel, BorderLayout.CENTER);
        
        // Add action listener to insert button
        insertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
					insertAttendeeEventRecord();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            }
        });
        
        // Set form properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    private void insertAttendeeEventRecord() throws ClassNotFoundException {
    	Class.forName("com.mysql.jdbc.Driver");
    	String url = "jdbc:mysql://localhost:3306/EventManage";
        String user = "root";
        String password = "Vivek_007";
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            
            String insertSql = "INSERT INTO Attendee_Event (AttendeeID, EventID) VALUES (?, ?)";
            PreparedStatement statement = conn.prepareStatement(insertSql);
            
            int attendeeID = Integer.parseInt(attendeeIDField.getText());
            int eventID = Integer.parseInt(eventIDField.getText());
            
            statement.setInt(1, attendeeID);
            statement.setInt(2, eventID);
            
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(this, "A new attendee-event record was inserted successfully!");
            }
            
            conn.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error occurred while inserting attendee-event record: " + ex.getMessage());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid attendee and event IDs!");
        }
    }
    
    public static void main(String[] args) {
        InsertAttendeeEventForm form = new InsertAttendeeEventForm();
        form.setVisible(true);
    }
}
