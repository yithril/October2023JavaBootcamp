package org.example;

public class Card {
    private Suit suit;
    private String value;
    private boolean isFaceUp;

    public Card(Suit suit, String value){
        this.suit = suit;
        this.value = value;
        this.isFaceUp = true;
    }

    public Suit getSuit(){
        if(isFaceUp){
            return this.suit;
        }
        else{
            return null;
        }
    }

    public String getValue(){
        if(isFaceUp){
            return value;
        }
        else{
            return "#";
        }
    }

    public int getPointValue(){
        if(isFaceUp){
            switch(value){
                case "A":
                    return 11;
                case "K":
                case "Q":
                case "J":
                    return 10;
                default:
                    return Integer.parseInt(value);
            }
        }
        else{
            return 0;
        }
    }

    public boolean isFaceUp(){
        return isFaceUp;
    }

    public void flip(){
        isFaceUp = !isFaceUp;
    }
}
