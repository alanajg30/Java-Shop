import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class loginPage implements ActionListener{
	JFrame Login_frame = new JFrame();
	
	TitleScreenHandler tsHandler = new TitleScreenHandler();
	
	JButton loginButton = new JButton("Login");
	JButton CreateAccountButton = new JButton("Create an account");
	JButton resetButton = new JButton();
	JTextField userIDField = new JTextField();
	JPasswordField userPasswordField = new JPasswordField();
	JLabel JavaShop = new JLabel("Welcome to Java Shop");
	JLabel userIDLabel = new JLabel("Username:");
	JLabel userPasswordLabel = new JLabel("Password:");
	JLabel messageLabel = new JLabel(); 
	
	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	loginPage(HashMap<String,String> loginInfooOriginal) {
		logininfo = loginInfooOriginal;
		JavaShop.setBounds(115,25,150,50);
		userIDLabel.setBounds(50, 100, 75, 25);
		userPasswordLabel.setBounds(50, 150, 75, 25);
		messageLabel.setBounds(160, 225, 250, 35);
		
		userIDField.setBounds(125,100,200,25);
		userPasswordField.setBounds(125,150,200,25);
		
		loginButton.setBounds(160,200,100,25);
		loginButton.addActionListener(this);
		CreateAccountButton.addActionListener(tsHandler);
		CreateAccountButton.setBounds(140,260,138,25);
		
		Login_frame.add(JavaShop);
		Login_frame.add(userIDLabel);
		Login_frame.add(userPasswordLabel);
		Login_frame.add(messageLabel);
		Login_frame.add(userIDField);
		Login_frame.add(userPasswordField);
		Login_frame.add(loginButton);
		Login_frame.add(CreateAccountButton);
		
		Login_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Login_frame.setSize(420,420);
		Login_frame.setLayout(null);
		Login_frame.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==loginButton) {
			String userID = userIDField.getText();
			String password = String.valueOf(userPasswordField.getPassword());
		if(logininfo.containsKey(userID)) {
			if(logininfo.get(userID).equals(password)) {
				messageLabel.setForeground(Color.blue);
				messageLabel.setText("Login Successful");
				Login_frame.dispose();
				ShoppingPage openShoppingPage = new ShoppingPage();
			}
			else {
				messageLabel.setForeground(Color.red);
				messageLabel.setText("Wrong Password");
			}

		}
		else {
			messageLabel.setForeground(Color.red);
			messageLabel.setText("username not found");
			}
		
		}
	}
	
	public class TitleScreenHandler implements ActionListener {
		
		public void actionPerformed(ActionEvent event) {
			CreateAccount createAccount = new CreateAccount();
		}
	}
			
		}
		

