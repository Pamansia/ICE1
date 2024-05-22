/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Scanner;

public class CardTrick {
    public static final String[] SUITS = {"hearts", "diamonds", "clubs", "spades"};

    public static void main(String[] args) {
        // Your code here
   
 
        // Instantiate a scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Instantiate MagicHand object
        MagicHand magicHand = new MagicHand();
        
        // Generate a random number for the card value
        int randomValue = (int) (Math.random() * 13) + 1; // Generates a random number between 1 and 13
        
        // Generate a random number for the card suit
        int randomSuitIndex = (int) (Math.random() * 4); // Generates a random number between 0 and 3
        
        // Create a Card object with random value and suit
        Card randomCard = new Card(randomValue, Card.SUITS[randomSuitIndex]);
        
        // Add the random card to the magicHand
        magicHand.addCard(randomCard);
        
        // Add a hardcoded luck card (value: 2, suit: clubs)
        Card luckCard = new Card(2, "clubs");
        magicHand.addCard(luckCard);
        
        // Prompt the user to input card value and suit
        System.out.println("Enter your card value (1-13): ");
        int userValue = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        
        System.out.println("Enter your card suit (hearts, diamonds, clubs, spades): ");
        String userSuit = scanner.nextLine();
        
        // Create the user's card
        Card userCard = new Card(userValue, userSuit);
        
        // Search for the user's card in magicHand
        boolean found = magicHand.searchCard(userCard);
        
        // Report the result
        if (found) {
            System.out.println("Congratulations! Your card is in the magic hand!");
        } else {
            System.out.println("Sorry, your card is not in the magic hand.");
        }
    }
}
