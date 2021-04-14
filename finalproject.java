import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;

public class finalproject {
    public static void main(String[] args){
       		JFrame window;
		Container con; 
		JPanel titleNamePanel, 
	    	JLabel titleNameLabel,
	    
	    	Font titleFont = new Font("Times New Roman", Font.PLAIN, 90);
}
	public Login_Screen() {
			//Initialized JFrame to window
			//sets the size, color, adds a funtion to close the funtion  
			window = new JFrame();
			window.setSize(800, 600);
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			window.getContentPane().setBackground(Color.black);
			window.setLayout(null);
			window.setVisible(true);
			con = window.getContentPane();
		
			titleNamePanel = new JPanel();
			titleNamePanel.setBounds(100, 100, 600, 150);
			titleNamePanel.setBackground(Color.black);
			titleNameLabel = new JLabel("Login");
			titleNameLabel.setForeground(Color.blue);
			titleNameLabel.setFont(titleFont);
}
