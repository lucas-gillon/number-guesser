package com.hetfield.numberguesser;

import java.util.Random;
import java.util.Scanner;

public class NumberGuesser {

    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;

        System.out.println("Welcome Number Guessing Game");
        System.out.printf("number to guess is '%s' \n", randomNumber);

        Scanner scanner = new Scanner(System.in);
        int numberOfTries = 0;

        while (true) {
            System.out.println("Enter your guess (1 - 100) : ");

            int playerGuess = scanner.nextInt();


            if (playerGuess == randomNumber) {
                numberOfTries++;
                System.out.println("Correct ! You win");
                System.out.printf("You made it in %s tries", numberOfTries);
                break;
            } else if (randomNumber > playerGuess) {
                numberOfTries++;
                System.out.println("The number is higher, Guess again.");
            } else {
                numberOfTries++;
                System.out.println("The number is lower, Guess again.");
            }

        }

    }

}
