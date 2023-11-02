package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;
    String[] values = {"2","3","4","5","6","7","8",
            "9","10","J","Q","K","A"};

    public Deck(){
        for(Suit suit : Suit.values()){
            for(String value : values){
                Card card = new Card(suit, value);
                cards.add(card);
            }
        }
    }

    public void shuffle(){
        Collections.shuffle(cards);
    }

    public Card deal(){
        //if there are cards left in the deck
        if(cards.size() > 0){
            //get the card from the top of the deck
            Card card = cards.remove(0);
            return card;
        }
        else{
            return null;
        }
    }

    public int getSize(){
        return cards.size();
    }
}
