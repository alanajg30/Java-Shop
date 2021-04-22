import java.util.ArrayList;

//main
public class loginScreen {

		public static void main(String[] arg) {
			//ShoppingPage openShoppingPage = new ShoppingPage(); For testing shop page only

			Users_information id_and_passwords = new Users_information();
			
			
			loginPage LoginPage = new loginPage(id_and_passwords.getLoginInfo());


		}
		
	

}
