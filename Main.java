package com.java.training;

import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);

	// function to checkPalindrome

	public void checkPalindrome() {		
		System.out.println("Please enter a number to find whether it is a palindrome!!! \n");
		int num = sc.nextInt();
		int reversedNum = 0, remainder;
		int originalNum = num;
		while (num != 0) {
			remainder = num % 10;
			reversedNum = reversedNum * 10 + remainder;
			num /= 10;
		}
		if (originalNum == reversedNum) {
			System.out.println(originalNum + " is Palindrome.");
		} else {
			System.out.println(originalNum + " is not Palindrome.");
		}
	}

	// function to printPattern

	public void printPattern() {		
		System.out.println("Please enter a number to print pattern of stars!!! \n");
		int rows = sc.nextInt();
		for (int i = rows - 1; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}

	// function to check no is prime or not

	public void checkPrimeNumber() {
		System.out.println("Please enter a number to find prime or not!!! \n");
		int num = sc.nextInt();
		int counter=0; 		
		int i = num;
        for(num =i; num>=1; num--)
        {
	    if(i%num==0)
	    {
		counter = counter + 1;
	    }
	 }
        if (counter == 2) {
        	System.out.println(i + " is a prime number");
        }else {
        	System.out.println(i + " is a not prime number");
        }
	}

	// function to print Fibonacci Series

	public void printFibonacciSeries() {

		// initialize the first and second value as 0,1 respectively.

		int first = 0, second = 1;
		System.out.println("Please enter a range to print fibonacci series!!! \n");
		int num = sc.nextInt();
		 int counter = 0;
		  
	        while (counter < num) {	  
	            System.out.print(first + " ");
	            int num3 = second + first;
	            first = second;
	            second = num3;
	            counter++;
	        }

	}

//main method which contains switch and do while loop

	public static void main(String[] args) {

		Main obj = new Main();

		int choice;

		Scanner sc = new Scanner(System.in);

		do {

			System.out.println("\nEnter your choice from below list.\n" + "1. Find palindrome of number.\n"

					+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

					+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

			System.out.println();

			choice = sc.nextInt();

			switch (choice) {

			case 0:

				choice = 0;

				break;

			case 1: {

				obj.checkPalindrome();

			}

				break;

			case 2: {

				obj.printPattern();

			}

				break;

			case 3: {

				obj.checkPrimeNumber();

			}

				break;

			case 4: {

				obj.printFibonacciSeries();

			}

				break;

			default:

				System.out.println("Invalid choice. Enter a valid no.\n");

			}

		} while (choice != 0);

		System.out.println("Exited Successfully!!!");

		sc.close();

	}

}
