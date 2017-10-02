//Marcos Flores
//CS112

import java.util.Scanner;

public class GameRPS
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int userIn;
		int randomNum;
		String s1 = "You win.";
		String s2 = "You lose.";		
		
		System.out.print("Welcome.\n1 is rock, 2 is paper, and 3 is scissors.\nChoose your hand: ");
		userIn = input.nextInt();

		if (userIn > 3) //This and line 24 are conditions for the user inputting a choice other than the ones indicated
		{
			System.out.print("Not one of the choices. You lose by default.");
			return; //This and line 27 break the loop if the user inputs a choice other than the ones indicated
		}
		if (userIn < 1) //See comment on line 19
		{
			System.out.print("Not one of the choices. You lose by default.");
			return;
		}
		
		if (userIn == 1) //Lines 30-37 simply give you the hand you chose
			System.out.println("Your hand is rock.");

		if (userIn == 2)
			System.out.println("Your hand is paper.");

		if (userIn == 3)
			System.out.println("Your hand is scissors.");

		randomNum = 1 + (int)(Math.random() * (4 - 1)); //This returns a random number from 1-3

		if (randomNum == 1) //Lines 41-48 simply show you the random number generated, aka "the hand the computer chose"
			System.out.println("CP hand is rock.");

		if (randomNum == 2)
			System.out.println("CP hand is paper.");

		if (randomNum == 3)
			System.out.println("CP hand is scissors.");
		
		if (userIn == randomNum) //Lines 50-69 are all the possible outcomes. Line 50 covers 3 possibilites, where both players "choose" the same hand
			System.out.println("This game is a tie.");
		
		if (userIn == 1 && randomNum == 2)
			System.out.printf("%s%n", s2); //I thought using printf instead of println would make the code look better, but that's stil up for debate
		
		if (userIn == 1 && randomNum == 3)
			System.out.printf("%s%n", s1);
		
		if (userIn == 2 && randomNum == 1)
			System.out.printf("%s%n", s1);
		
		if (userIn == 2 && randomNum == 3)
			System.out.printf("%s%n", s2);
		
		if (userIn == 3 && randomNum == 1)
			System.out.printf("%s%n", s2);
		
		if (userIn == 3 && randomNum == 2)
			System.out.printf("%s%n", s1);
	}
}

// Good job, mflores17..Need to knoow your name and need to add more comments in code please
