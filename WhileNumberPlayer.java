package com.in28minutes.loops;

public class WhileNumberPlayer {
	
	private int limit;
	
	WhileNumberPlayer (int limit) {
		this.limit = limit;
	}

	public void printSquaresUpToLimit() {
		
		int i = 1;
		int square = 1;
		
		while(i*i < limit) {
			square = i * i;
			System.out.print(square + " ");
			i++;
		}
	}

	public void printCubesUpToLimit() {
		
		int i = 1;
		int cube = 1;
		
		while(i*i*i < limit) {
			cube = i*i*i;
			System.out.print(cube + " ");
			i++;
		}
	}
}
