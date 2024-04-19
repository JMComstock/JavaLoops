package com.in28minutes.loops;

import java.util.Scanner;

public class DoubleDown {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final int NUM_ELEMENTS = 8;             // Number of elements
        int[] userVals = new int[NUM_ELEMENTS]; // User numbers
        int i;                                  // Loop index

        // Prompt user to input values
        System.out.println("Enter " + NUM_ELEMENTS + " integer values...");
        for (i = 0; i < userVals.length; ++i) {
            System.out.println("Value: ");
            userVals[i] = scnr.nextInt();
        }

        // Double each element. FIXME write this loop
        for (i=0; i<NUM_ELEMENTS; i++) {
            System.out.println("Your value doubled: " + userVals[i]*2 + " ");
        }
        // Print numbers
        System.out.print("New numbers: ");
        for (i = 0; i < userVals.length; ++i) {
            System.out.print(userVals[i] + " ");
        }
    }
}
