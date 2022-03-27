package SnakeLadderProgram;

import java.util.Random;

public class UC2SnakeNLadder {

	public static void main(String[] args) {
		System.out.println("The Player rolls the die to get a number between 1 to 6.");
		 Random rand=new Random();
		 System.out.print("The dice rolls to: ");
		 System.out.print(rand.nextInt(6)+1);
	}

}
