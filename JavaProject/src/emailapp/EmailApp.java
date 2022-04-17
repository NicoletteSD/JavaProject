package emailapp;

public class EmailApp {



//Start of Main Method. This helps to connect all classes together. 
//(HINT: reason for making it static)
public static void main(String[] args) {
Email em1 = new Email("Nicolette","Hill");	
	System.out.println(em1.showInfo());
	
	
//Calling on alternate Email. Im able to acess this because of getters & setters
	//em1.setAlternateEmail("Your Alternet Email is: " + "NH@xpanion.com");
	//System.out.println(em1.getAlternateEmail());
	
	
//Calling on Mailbox Capacity 
	//em1.setMailboxCapacity(500);
	//System.out.println(em1.getMailboxCapacity());
	
//Calling on Change of Password
	//em1.setPassword("Your Password is :" + "********");
	//System.out.println(em1.getPassword());
	
	
	
	
	
	
		
		
		
}

private static Email changePassword(Object password) {
	// TODO Auto-generated method stub
	return null;
}

private static Email setMailboxCapacity(Object capacity2) {
	// TODO Auto-generated method stub
	return null;
}
}