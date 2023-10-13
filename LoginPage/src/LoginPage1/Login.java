package LoginPage1;

import javax.swing.*;
import java.awt.event.*;


public class Login {
	
	    private JFrame frame;
	    private JTextField usernameField;
	    private JPasswordField passwordField;
	    private JLabel usernameLabel;
	    private JLabel passwordLabel;
	    private JButton loginButton;

	    public Login() {
	        frame = new JFrame("Login Page");
	        frame.setSize(300, 150);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setLayout(null);

	        usernameLabel = new JLabel("Username:");
	        usernameLabel.setBounds(10, 10, 80, 25);
	        frame.add(usernameLabel);

	        usernameField = new JTextField();
	        usernameField.setBounds(100, 10, 165, 25);
	        frame.add(usernameField);

	        passwordLabel = new JLabel("Password:");
	        passwordLabel.setBounds(10, 40, 80, 25);
	        frame.add(passwordLabel);

	        passwordField = new JPasswordField();
	        passwordField.setBounds(100, 40, 165, 25);
	        frame.add(passwordField);

	        loginButton = new JButton("Login");
	        loginButton.setBounds(10, 80, 80, 25);
	        frame.add(loginButton);

	        loginButton.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                String username = usernameField.getText();
	                String password = new String(passwordField.getPassword());
	                // authenticate username and password
	            }
	        });

	        frame.setVisible(true);
	    }

	    public static void main(String[] args) 
		{
	        new Login();
		}
	}

