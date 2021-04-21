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

	
		public static String editDay = "20";
		public static String editMonth = "March";
		public static String editYear = "1993";
		public static String editGender = "Female";
		
		public static String editFirstname = FakerConfig.getEditFirstName();
		public static String editLastname = FakerConfig.getEditLastName();
		public static String editEmail =  FakerConfig.getEditEmail();
		public static String editCompany = FakerConfig.getEditCompanyName();
	}

}
