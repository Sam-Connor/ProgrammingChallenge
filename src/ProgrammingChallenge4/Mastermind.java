package ProgrammingChallenge4;

import java.util.ArrayList;
import java.util.Scanner;

public class Mastermind {

	public static void main(String[] args) {
		
		ArrayList<Colours> answer = new ArrayList<Colours>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("~~~~Choose your 4 colours~~~~");
		System.out.println("1. Red");
		System.out.println("2. Blue");
		System.out.println("3. Green");
		System.out.println("4. Purple");
		System.out.println("5. Yellow");
		System.out.println("6. White");
		
		for (int i = 0; i < 4; i++) 
		{
		
			int choice = sc.nextInt();
			switch (choice)
			{
				case 1: answer.add(Colours.Red);
						break;
				case 2: answer.add(Colours.Blue);
						break;
				case 3: answer.add(Colours.Green);
						break;
				case 4: answer.add(Colours.Purple);
						break;
				case 5: answer.add(Colours.Yellow);
						break;
				case 6: answer.add(Colours.White);
						break;
				default: break;
			}
			
		}
		
		sc.close();
		
		for (Colours colours : answer) {
			
			System.out.println(colours.toString());
			
		}
		
		int guessesLeft = 12;
		ArrayList<Colours> guesses = new ArrayList<Colours>();
		
		

	}

}
