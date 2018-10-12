package lab6;

import java.util.Random;
import java.util.Scanner;

public class DieRoll {

	public static void main(String[] args) {
		{
	        // TODO Auto-generated method stub
	        Scanner scnr = new Scanner(System.in);
	        System.out.println("Welcome to the Grand Circus Casino!");
	        System.out.println("                                   ");
	        
	        String userResponse = "yes";
	        
	        int i;

	        do {
	            System.out.println("How many sides should each die have?");
	            
	            int sides;
	            //this is the number of sides of the dice
	            //userInput = scnr.nextInt();
	            sides = scnr.nextInt();
	            int firstDie;
	            int secondDie;
	            //userInput throws random die twice
	            firstDie = generateRandomDieRoll(sides);
	            secondDie = generateRandomDieRoll(sides);
	            
	            System.out.println("Roll 1 " + "," + firstDie);
	            System.out.println("Roll 2 " + "," + secondDie);
	            
	            //for (i = 1; i <= userInput; i++)
	            
	            //scnr.nextLine();
	        
	        System.out.println("Continue? yes/no");
	        userResponse = scnr.next();
	        } while (userResponse.equals("yes"));
	        userResponse = scnr.next();
		}
	            
	    }

	    public static int generateRandomDieRoll(int sides) {
	        Random rand = new Random();
	        //System.out.println(rand.nextInt());
	        return rand.nextInt(sides);
	    }
	}