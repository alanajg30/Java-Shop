import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class WelcomePage {

		JFrame frame = new JFrame();
		JLabel welcomeLabel = new JLabel("Hello!");
		
		WelcomePage(){
			
			welcomeLabel.setBounds(60,150,200,35);
			welcomeLabel.setFont(new Font(null,Font.PLAIN,25));
			
			frame.add(welcomeLabel);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(420, 420);
			frame.setLayout(null);
			frame.setVisible(true);
			ShoppingPage openShoppingPage = new ShoppingPage();
		
	}

}