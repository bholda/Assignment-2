/*
* Class: CMSC203 
 * Instructor:
 * Description: (Give a brief description for each Class)
 * Due: 2/23/2021
 * Platform/compiler:
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: __________
*/


package assignment2;
import java.util.Scanner;

public class RandomNumberGuesser {
	public static void main(String args[]) {
	int wholeloop = 0;
	while(wholeloop == 0) {
	int guesscount = 0;
	int low = 0, high = 99; 
	Scanner scan = new Scanner(System.in);
	RNG rngclass = new RNG();
	int key = rngclass.rand();
	System.out.println("Enter your first guess: ");
	int guess = scan.nextInt();
	guesscount++;
	System.out.println("Number of guesses is " + guesscount);
	if(guess > key) {
		System.out.println("Your guess is too high");
		high = guess;
		
	}else if(guess < key) {
		System.out.println("Your guess is too low");
		low = guess;
	}
	int loop = 0;
	while(loop == 0) {
		if(guess == key)
		{
			loop = 1;
			System.out.println("Congratulations you guessed corrrectly!");
			System.out.println("Would you like to try again ?");
			String redo = scan.next();
			if(redo.equals("yes") || redo.equals("Yes")) {
				break;
			}else {
				System.out.println("Thanks for playing");
				wholeloop = 1;
				break;
			}
		
		}
	System.out.println("Enter your next guess between " + low + " and " + high);
	guess = scan.nextInt();
	boolean inbounds = rngclass.inputValidation(guess, low, high);
	if(inbounds == true) {
		
	}else {
		guess = scan.nextInt();
	}
	guesscount++;
	System.out.println("Number of guesses is " + guesscount);
	if(guess > key) {
		System.out.println("Your guess is too high");
		high = guess;
		
	}else if(guess < key) {
		System.out.println("Your guess is too low");
		low = guess;
	}
	}
	}
	}
}
