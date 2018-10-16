package lab7;

import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class InvalidInputsApp {
	
	public static void main(String[] args) {
	Scanner scnr = new Scanner(System.in);
	System.out.println("Please enter a valid Name: ");
	String userInput = scnr.nextLine();
	isValidName(userInput); 
	
	System.out.println("Please enter a valid email: ");
	String userResponse = scnr.nextLine();
	isValidEmail(userResponse);

	System.out.println("Please enter a valid phone number: ");
	String input = scnr.nextLine();
	isValidNumber(input);
	
	System.out.println("Please enter a valid date: ");
	String response = scnr.nextLine();
	isValidDate(response);
	

	}
private static boolean isValidName(String userInput) {
	boolean isValidName = true; 
	
	if (userInput.matches("[A-Z][a-zA-Z]*")) {
		System.out.println("Name is valid!") ;
		isValidName = true;
		
	} else {
		System.out.println("Name is invalid!");
		isValidName = false;
	}
	return isValidName;

	
	
}		
	
private static boolean isValidEmail (String userResponse) {
		boolean isValidEmail = true;
		
		if (userResponse.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
			System.out.println("Email is valid!");
			isValidEmail = true;

		} else {
			System.out.println("Email is invalid!");
			isValidEmail = false;
		}
		return isValidEmail;

}

private static boolean isValidNumber (String input) {
		boolean isValidNumber = true;
		
		if (input.matches("\\d{3}\\ \\d{3}-\\d{4}")) {
			System.out.println("Phone number is valid!");
			isValidNumber = true;
			
		} else {
			System.out.println("Sorry, phone number is invalid!");
			isValidNumber = false;
		}
	return isValidNumber;

	
}


private static boolean isValidDate (String response) {
		boolean isValidDate = false;

		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
		format.setLenient(false);
		
		Date date = null;
				
			try {
				
				date = format.parse(response);
				System.out.println("Date is valid!");
				isValidDate = true;
				
			} catch (ParseException ex) {
				System.out.println("Sorry, date is invalid!");
				isValidDate = false;
				
			}
			

		return isValidDate;
	
}


}
