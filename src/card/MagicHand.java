/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Arrays;

public class MagicHand {
    private final Card[] cards;
    private int numCards;

    public MagicHand() {
        cards = new Card[10]; // Max 10 cards in the magic hand
        numCards = 0;
    }

    public void addCard(Card card) {
        if (numCards < 10) {
            cards[numCards] = card;
            numCards++;
        } else {
            System.out.println("Magic hand is full. Cannot add more cards.");
        }
    }

    public boolean searchCard(Card card) {
        for (int i = 0; i < numCards; i++) {
            if (cards[i].getValue() == card.getValue() && cards[i].getSuit().equals(card.getSuit())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "MagicHand{" +
                "cards=" + Arrays.toString(cards) +
                ", numCards=" + numCards +
                '}';
    }
}
