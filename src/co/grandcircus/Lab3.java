package co.grandcircus;

import java.util.Scanner;

public class Lab3 {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	System.out.println("What is your name?");
	String name = scan.nextLine();

	// Prompt user for an integer
	System.out.println(name + ", please enter an integer between 1 and 100:");
	int num = scan.nextInt();

	if (num >= 1 && num <= 100) { // validates number is between 1 and 100
	    if (!isEven(num) && (num > 60)) { // odd and > 60
		printNum(num, name);
		System.out.println(name + ", the number is odd and over 60.");
	    } else if (isEven(num) && (num > 60)) { // even and > 60
		printNum(num, name);
		System.out.println(name + ", the number is even.");
	    } else if ((num >= 2 && num <= 25) && isEven(num)) { // in between 2 and 25, and even
		System.out.println(name + ", the number is even and less than 25.");
	    } else if ((num >= 26 && num <= 60) && isEven(num)) { // in between 26 and 60, and even
		System.out.println(name + ", the number is even.");
	    } else if (!isEven(num)) { // odd
		printNum(num, name);
		System.out.println(name + ", the number is odd.");
	    }
	} else {
	    System.out.println(name + ", please make sure your number is between 1 and 100.");
	}

	System.out.println("Goodbye.");

	scan.close();
    }

    // Check if number is even
    private static boolean isEven(int i) {
	if (i % 2 == 0) {
	    return true;
	} else {
	    return false;
	}
    }

    // Prints a number to cut down on code written
    private static void printNum(int i, String name) {
	System.out.println(name + ", you entered: " + i);
    }

}
