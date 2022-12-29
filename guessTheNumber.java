// The mini project starts

import java.util.*;

// driver class
public class guessTheNumber {
    public static void main(String[] args) {
        
        // created a object of the Scanner class
        Scanner sc = new Scanner(System.in);

        // created a mynum variable which will have random int value 
        // every time the code is ran
        int mynum = (int)(Math.random()*100);

        // created and initialized a variable in which user input will be stored
        int userNumber = 0;

        // do-while loop to create a simple UI
        do {

            // taking the user input for the guess
            System.out.print("Guess my number (1 to 100): ");
            userNumber = sc.nextInt();

            // if the guessed number is correct
            if (userNumber == mynum) {
                System.out.println("YEHHH!!! CORRECT NUMBER!!!");
                break;
            }

            // if the guessed number is larger than THE number
            else if (userNumber > mynum) {
                System.out.println("Your number is too large!");
            }

            // if the guessed number is smaller than THE number
            else if (userNumber < mynum) {
                System.out.println("Your number is too small!");
            }

            // if the user have given a value less than 0 or more than 100
            else {
                System.out.println("WRONG INPUT!!!!");
            }

        }while(true);

        // printing the The number that needed to be guessed
        System.out.println("My Number was: " + mynum);
        System.out.println("\n");
    }
}