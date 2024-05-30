package org.udemekendrick.geeksforgeeks;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CardShuffle {

    public static int getNthCard(int[] rounds, int N) {
//        Initialize the deck of 100 cards
        List<Integer> deck = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            deck.add(i);
        }

//        Process each round
        for (int k : rounds) {
            deck = shuffle(deck, k);
        }

//        Return the Nth card from the top
        return deck.get(N - 1);
    }

    public static List<Integer> shuffle(List<Integer> deck, int k) {
        List<Stack<Integer>> piles = new ArrayList<>();

//        Initialize  the piles
        for (int i = 0; i < k; i++) {
            piles.add(new Stack<>());
        }

//        Distribute cards into k piles
        for (int i = 0; i < deck.size(); i++) {
            int pileIndex = i % k;
            piles.get(pileIndex).push(deck.get(i));
        }

//        Collect cards back into the deck, flipping each pile bottom to top
        List<Integer> newDeck = new ArrayList<>();
        for (int i = k - 1; i >= 0; i--) {
            Stack<Integer> pile = piles.get(i);
            while (!pile.isEmpty()) {
                newDeck.add(pile.pop());
            }
        }

        return newDeck;
    }
}
