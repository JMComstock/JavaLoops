package com.in28minutes.loops;

public class WhileNumberPlayerRunner {

	public static void main(String[] args) {

		WhileNumberPlayer player = new WhileNumberPlayer(90);
		
		player.printSquaresUpToLimit();
		
		System.out.print("\n");
		
		player.printCubesUpToLimit();
	}

}
