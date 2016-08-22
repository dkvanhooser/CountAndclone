import java.util.Scanner;

public class CountAndCloneApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Countable alligator = new Alligator();
		Countable firstSheep = new Sheep();
		boolean valid = false;
		
		do{
		System.out.println("how many aligators do you want to count?");
		CountUtil.count(alligator,scan.nextInt());
		scan.nextLine();
		
		
		System.out.println("what should this sheep's name be?");
		((Sheep)firstSheep).setName(scan.nextLine());
		
		Countable secondSheep;
		secondSheep = ((Sheep)firstSheep).clone(firstSheep);
		
		System.out.println("how many sheep of "+ firstSheep.getName()+" do you want to count?");
		CountUtil.count(firstSheep,scan.nextInt());
		
		scan.nextLine();
		
		
		System.out.println("what should Sheep number 2's name be?");
		((Sheep)secondSheep).setName(scan.nextLine());
		
		System.out.println("how many sheep of "+ secondSheep.getName()+" do you want to count?");
		CountUtil.count(secondSheep,scan.nextInt());
		
		System.out.println("I hope you want to count the first sheep again because thats what we're doing.");
		firstSheep.resetCount();
		System.out.println("how many sheep of "+ firstSheep.getName()+" do you want to count?");
		CountUtil.count(firstSheep,Validator.isInt(scan));
		scan.nextLine();
		System.out.println("do you want to continue? y/n");
		valid = Validator.isValidContinue(scan);
		alligator.resetCount();
		secondSheep.resetCount();
		firstSheep.resetCount();
		}while(valid);
		System.out.println("thanks for using this useless app");
		scan.close();
		
	}

}
