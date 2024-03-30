package com.in28minutes.loops;

import java.util.Scanner;

public class DoWhileRepeatedRunner {

	public static void main(String[] args) {
		
		int number;
		int cube;
		
		do {
			Scanner scanner = new Scanner(System.in);

			System.out.println("Enter a number: ");
			number = scanner.nextInt();
			if(number >= 0) {
				cube = number * number * number;
				System.out.println("Cube is " + cube);
			} else {
				System.out.println("Thank You! Have Fun!");
				break;
			}
			
			
		} while (number > 0);
	}
}
