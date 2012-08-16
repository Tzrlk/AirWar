package nz.co.aetheric.airwar;

import java.util.LinkedList;
import java.util.List;

public class CardDeck {
    private List<Card> deck;

    public CardDeck() {
        initialiseDeck();
    }

    public void shuffle() {

    }

    public Card draw() {
        return null;
    }

    private void initialiseDeck() {
        deck = new LinkedList<Card>();
        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Face face : Card.Face.values()) {
                deck.add(new Card(face, suit));
            }
        }
    }
}