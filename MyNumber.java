package com.in28minutes.loops;

public class MyNumber {
	
	private int number;
	
	public MyNumber (int number) {
		this.number = number;
	}
	
	public boolean isPrime() {
		// 2 to number -1
		// How can check if a number is divisible by 2
		
		// guard condition 
		if(number < 2) {
			return false;
		}
		
		for(int i = 2; i<=number-1; i++) {
			if(number % i == 0) {
			return false;
			}
		}
		return true;

	}

	public int sumUpToN() {
		
		int sum = 0;
		
		for(int i = 1; i<= number; i++) {
			sum += i;

		}
		return sum;
	}

	public int sumOfDivisors() {
		
		int sum = 0;
		for(int i=2; i<number; i++) {
			if(number%i == 0) {
				sum += i;
			}
		}
		return sum;
	}

	public void printNumberTriangle() {
	
		for(int i=1; i<=number; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
