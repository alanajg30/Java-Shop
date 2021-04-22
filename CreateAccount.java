	import java.awt.Font;
	import javax.swing.JFrame;
	import javax.swing.JLabel;

		public class CreateAccount {

				JFrame CreateAcountframe = new JFrame();
				JLabel welcomeLabel = new JLabel("Hello!");
				
				CreateAccount(){
					
					welcomeLabel.setBounds(60,150,200,35);
					welcomeLabel.setFont(new Font(null,Font.PLAIN,25));
					
					CreateAcountframe.add(welcomeLabel);
					CreateAcountframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					CreateAcountframe.setSize(420, 420);
					CreateAcountframe.setLayout(null);
					CreateAcountframe.setVisible(true);
				
	}

}
