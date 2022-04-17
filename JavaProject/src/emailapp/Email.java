/*
 * Author: Nicolette Hill
 * Date: 17 April 2022
 * Overview: : You are an IT Support Administrator Specialist and are 
   charged with the task of creating email accounts for new hires.
*/

package emailapp;

import java.util.Scanner;

public class Email {

//Creating Attributes for new hire emails.	
private String firstName;
private String lastName;
private String password;
private String department;
private int mailboxCapacity = 500;
private String alternateEmail;
private int defaultPasswordLength = 8;
private int i;
private String email;

//Creating constructors for firstName & lastName 
public Email(String firstName, String lastName) {
	
	this.firstName = firstName;
	this.lastName = lastName;
	

//Calling for method to ask for department
	this.department = setDepartment();
	System.out.println("Department: " + this.department);
	
	
//Calling for method to ask for random Password	
	this.password = randomPassword(defaultPasswordLength);
	System.out.println("Your Password is: " + this.password);
	
String companySuffix = "Vangaurd.com";
	// calling elements to email
	email = firstName.toUpperCase() + "," + lastName.toUpperCase() + "@" + department + "." + companySuffix;
	
}


// department of New Hire(sales, development and accountant). Utilize the if/ else statements to find the new hire department
private String setDepartment() {
	System.out.println("DEPARTMENT CODES\n1 for sales\n2 for department\n3 for accounting\n0 for none\n Enter Department Code:");
	Scanner in = new Scanner(System.in);
	int depChoice = in.nextInt();
	if (depChoice ==1) { return "sales";}
	else if (depChoice == 2) { return "dev";}
	else if (depChoice == 3) { return "acct";}
	else { return "none"; }
	
	
}

//Generate a random password & return it so that you will be able to see the return of the random password
private String randomPassword(int length) {
	String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*";
	char[] password = new char[length];
	for(int i=0; i<length; i++);
	int rand = (int) (Math.random() * passwordSet.length());
	password[i] = passwordSet.charAt(rand);

return new String(password);
}

//Set mailbox capacity
public void setMailboxCapacity(int capacity) {
	this.mailboxCapacity = capacity;
}


//Set the alternate email
public void setAlternateEmail(String altEmail) {
	this.alternateEmail = altEmail;
}
//change the password
public void changePassword(String password) {
	this.password = password;

}

//Getter & setters to access the private functionactilities in the attributes
public String getPassword() {
	return password;
}


public int getMailboxCapacity() {
	return mailboxCapacity;
}


public String getAlternateEmail() {
	return alternateEmail;
}


public void setPassword(String password) {
	this.password = password;
}

public String showInfo() {
	return "DISPLAY NAME: " + firstName + "" + lastName +
			"\n COMPANY EMAIL: " + email + 
	 "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
	
}
	
}
