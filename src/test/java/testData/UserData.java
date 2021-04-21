package testData;

import commons.FakerConfig;

public class UserData {	
	public static class Register{
		public static String day = "20";
		public static String month = "March";
		public static String year = "1993";
		public static String gender = "Male";
		
		public static String firstname = FakerConfig.getFirstName();
		public static String lastname = FakerConfig.getLastName();
		public static String email =  FakerConfig.getEmail();
		public static String company = FakerConfig.getCompanyName();
		public static String password = FakerConfig.getPassword();

	}

}
