import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class CreateAccount {

		JFrame CreateAcountframe = new JFrame();
		private JTextField fName;
	    private JTextField lName;
	    private JTextField emailId;
	    private JTextField userName;
	    private JTextField phoneNumber;
	    private JPasswordField password;
	    private JButton createAccountButton;
		
		CreateAccount(){
			CreateAcountframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			CreateAcountframe.setSize(1000,600);
			CreateAcountframe.setLayout(null);
			CreateAcountframe.setVisible(true);
			
			JLabel lblNewUserRegister = new JLabel("Create Account");
	        lblNewUserRegister.setFont(new Font("Times New Roman", Font.PLAIN, 42));
	        lblNewUserRegister.setBounds(362, 52, 325, 50);
	        CreateAcountframe.add(lblNewUserRegister);

	        JLabel lblName = new JLabel("First name");
	        lblName.setFont(new Font("Tahoma", Font.PLAIN, 20));
	        lblName.setBounds(58, 152, 99, 43);
	        CreateAcountframe.add(lblName);

	        JLabel lblNewLabel = new JLabel("Last name");
	        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
	        lblNewLabel.setBounds(58, 243, 110, 29);
	        CreateAcountframe.add(lblNewLabel);

	        JLabel lblEmailAddress = new JLabel("Email\r\n address");
	        lblEmailAddress.setFont(new Font("Tahoma", Font.PLAIN, 20));
	        lblEmailAddress.setBounds(58, 324, 124, 36);
	        CreateAcountframe.add(lblEmailAddress);

	        fName = new JTextField();
	        fName.setFont(new Font("Tahoma", Font.PLAIN, 32));
	        fName.setBounds(214, 151, 228, 50);
	        CreateAcountframe.add(fName);
	        fName.setColumns(10);

	        lName = new JTextField();
	        lName.setFont(new Font("Tahoma", Font.PLAIN, 32));
	        lName.setBounds(214, 235, 228, 50);
	        CreateAcountframe.add(lName);
	        lName.setColumns(10);

	        emailId = new JTextField();

	        emailId.setFont(new Font("Tahoma", Font.PLAIN, 32));
	        emailId.setBounds(214, 320, 228, 50);
	        CreateAcountframe.add(emailId);
	        emailId.setColumns(10);

	        userName = new JTextField();
	        userName.setFont(new Font("Tahoma", Font.PLAIN, 32));
	        userName.setBounds(707, 151, 228, 50);
	        CreateAcountframe.add(userName);
	        userName.setColumns(10);

	        JLabel lblUsername = new JLabel("Username");
	        lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 20));
	        lblUsername.setBounds(542, 159, 99, 29);
	        CreateAcountframe.add(lblUsername);

	        JLabel lblPassword = new JLabel("Password");
	        lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
	        lblPassword.setBounds(542, 245, 99, 24);
	        CreateAcountframe.add(lblPassword);

	        JLabel lblMobileNumber = new JLabel("Mobile number");
	        lblMobileNumber.setFont(new Font("Tahoma", Font.PLAIN, 20));
	        lblMobileNumber.setBounds(542, 329, 139, 26);
	        CreateAcountframe.add(lblMobileNumber);

	        phoneNumber = new JTextField();
	        phoneNumber.setFont(new Font("Tahoma", Font.PLAIN, 32));
	        phoneNumber.setBounds(707, 320, 228, 50);
	        CreateAcountframe.add(phoneNumber);
	        phoneNumber.setColumns(10);

	        password = new JPasswordField();
	        password.setFont(new Font("Tahoma", Font.PLAIN, 32));
	        password.setBounds(707, 235, 228, 50);
	        CreateAcountframe.add(password);

	        createAccountButton = new JButton("Create New Account");
	        createAccountButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
	        createAccountButton.setBounds(399, 447, 200, 60);
	        CreateAcountframe.add(createAccountButton);
		
		}

}

