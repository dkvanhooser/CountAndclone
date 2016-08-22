

import java.util.InputMismatchException;
import java.util.Scanner;

public class Validator {
//makes sure the player that the user selected is valid, if not it loops around.


	//makes sure that the user enters y or n, otherwise it loops around
	public static boolean isValidContinue(Scanner scan) {
		String check = "";
		do {
			check = scan.nextLine();
			if (check.equalsIgnoreCase("y")) {
				return true;
			} else if (check.equalsIgnoreCase("n")) {
				return false;
			}
			System.out.println("Invalid entry, if you want to continue enter 'y', if not enter 'n'");

		} while (true);

	}
	
	//makes sure when the user enters rock paper or scissors that the value is valid, otherwise is loops around.
	public static int isInt(Scanner scan) {
		int check = 0;
		do {
			try {
				check = scan.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("invalid input, please enter a positive number.");
				continue;
			}
			if (check>0){
				return check;
			}else{
				System.out.println("number is not positive, please enter a positive number");
			}

		} while (true);
	}

}
