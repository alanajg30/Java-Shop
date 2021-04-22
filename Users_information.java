import java.util.HashMap;

public class Users_information {


		HashMap<String,String> Userinfo = new HashMap<String,String>();
		
		Users_information(){
			Userinfo.put("Jade","Sundevils");
			Userinfo.put("1235","jade123");	
		}
		protected HashMap getLoginInfo() {
			return Userinfo;
		}
	}