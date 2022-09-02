import java.util.Scanner;

class SwitchCase {
	
	static boolean again = true;
	static boolean dgb = false;
	
	public static void main(String[] args) {
		if(dgb) {System.out.println("debug is rockin");}
		int choice = 0;
		while(again == true) {
			
			System.out.println();
			
			Scanner Scanner = new Scanner(System.in);
			System.out.println("Welcome to Bank of Lisa & Jason, choose an option from 1-3: ");
			System.out.println("");
			
			System.out.println("Option 1: Deposit into your account.");
			System.out.println("Option 2: Account details.");
			System.out.println("Option 3: Withdrawl");

			
			int userInput = Scanner.nextInt();
			System.out.println();
			
			switch(userInput) {	// Choice passed to switch statement
			
			case 1:				// new record entry: newEntry()
				System.out.println("Your deposit was successfully posted.");
				System.out.println();
				break;
				
			case 2:				// displaying details of account: display()
				System.out.println("Account details successfully shown.");
				break;
				
			case 3: 			// deposit operation: deposit()
				System.out.println("Withdrawl was accepted.");
				break;
				
			default:			// If no case matches, default will be executed
				System.out.println("Invalid choice: (Sorry, enter 1-3)");
			}
			
			System.out.println("");
			System.out.println("Would you like to choose again? 1 = Y or 2 = N:  "); 
			userInput = Scanner.nextInt();
			if(userInput == 1) {
				again = true;
			}
			else {
				again = false;
				System.out.println("");
				System.out.println("Thank for Banking with the Bank of Lisa and Jason");
			}			
		}    //end-while
	} 		// end-main	
}           // end-class SwitchCase