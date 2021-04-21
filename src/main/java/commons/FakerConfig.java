package commons;

import java.util.Locale;

import com.github.javafaker.Faker;

public class FakerConfig {
	private static Locale locale = new Locale("en");
	private static Faker faker = new Faker(locale);

	public static FakerConfig getData() {
		return new FakerConfig();
	}
	
	public static String getFirstName() {
		return faker.address().firstName();		
	}
	
	public static String getLastName() {
		return faker.address().lastName();
	}
	
	public static String getCompanyName() {
		return faker.company().name();
	}
	
	public static String getFullName() {
		return faker.name().fullName();
	}
	
	public static String getAddress() {
		return faker.address().streetAddress();
	}
	
	public static String getEmail() {
		return faker.internet().emailAddress();
	}
	
	public static String getPhone() {
		return faker.phoneNumber().phoneNumber();
	}
	
	public static String getCity() {
		return faker.address().city();
	}
	
	public static String getCityName() {
		return faker.address().cityName();
	}
	
	public static String getPassword() {
		return faker.internet().password();
	}
	
}
