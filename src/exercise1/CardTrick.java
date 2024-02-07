package exercise1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author amanpreet rai
 * @author amanpreet rai feb 7, 2024 
 */
public class CardTrick {

    public static void main(String[] args) {

        Card[] hand = new Card[7];

        // Fill the hand array with random cards
        Random random = new Random();
        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue(random.nextInt(10) + 1); // Values from 1 to 10
            card.setSuit(Card.SUITS[random.nextInt(4)]); // Random suit from 0 to 3
            hand[i] = card;
        }

        // Ask the user for a card
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pick a card value (1-10): ");
        int userValue = scanner.nextInt();
        System.out.print("Pick a suit (1-Hearts, 2-Diamonds, 3-Clubs, 4-Spades): ");
        int userSuit = scanner.nextInt();

        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(Card.SUITS[userSuit - 1]); // Adjusting for 0-based array

        // Search for the user's card in the hand
        boolean matchFound = false;
        for (Card card : hand) {
            if (card.getValue() == userCard.getValue() && card.getSuit().equals(userCard.getSuit())) {
                matchFound = true;
                break;
            }
        }

        // If the guess is successful, invoke the printInfo() method
        if (matchFound) {
            printInfo();
        }
    }
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Amanpreet Rai, but you can call me Aman");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies: reading, music");
        System.out.println("-- Reading novels");
        System.out.println("-- listening music");

        System.out.println();
        
    
    }

}
