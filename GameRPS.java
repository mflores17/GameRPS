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

		if (userIn > 3)
		{
			System.out.print("Not one of the choices. You lose by default.");
			return;
		}
		if (userIn < 1)
		{
			System.out.print("Not one of the choices. You lose by default.");
			return;
		}
		
		if (userIn == 1)
			System.out.println("Your hand is rock.");

		if (userIn == 2)
			System.out.println("Your hand is paper.");

		if (userIn == 3)
			System.out.println("Your hand is scissors.");

		randomNum = 1 + (int)(Math.random() * (4 - 1));

		if (randomNum == 1)
			System.out.println("CP hand is rock.");

		if (randomNum == 2)
			System.out.println("CP hand is paper.");

		if (randomNum == 3)
			System.out.println("CP hand is scissors.");
		
		if (userIn == randomNum)
			System.out.println("This game is a tie.");
		
		if (userIn == 1 && randomNum == 2)
			System.out.printf("%s%n", s2);
		
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