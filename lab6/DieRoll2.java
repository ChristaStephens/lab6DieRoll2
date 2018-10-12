package lab6;
import java.util.Scanner;
import java.util.Random;

public class DieRoll2 {

	public static void main(String[] args) {
	
	String Name;
	
	System.out.println("Well hello there! Please enter your name.");// Press enter twice
	Scanner scnr = new Scanner(System.in);
	Name = scnr.next();
	System.out.println("Thank you " + Name + "!");

	System.out.println(" ");
	String userResponse = "yes";
		do {
			System.out.println("How's about we get started by rolling some dice "
					+ Name + "?");
			System.out.println("Please enter a number " + Name);
			
			int userInput;
			//Scanner scnr = new Scanner(System.in);
			userInput = scnr.nextInt();
			int firstDie;
			int secondDie;
			firstDie = generateRandomDieRoll(6);
			secondDie = generateRandomDieRoll(6);
			
			//System.out.println(firstDie );
			System.out.println("Your first roll is " + firstDie + ", and  "+ secondDie );
			//System.out.println(secondDie);
			
			
//			for (int i = 1; i <= userInput; i++) 
			System.out.println("continue?yes/no");
			userResponse = scnr.next();
			
		} while (userResponse.equals("yes"));
		//userResponse = scnr.next();
	}
	

public static int generateRandomDieRoll(int sides)  {
		Random rand = new Random();
		//System.out.println(rand.nextInt(6));//maybe comment out
		//return rand.nextInt(12);
		int dice;
		dice = rand.nextInt(sides)+ 1;
		return dice;// maybe put sides
		

}
}
