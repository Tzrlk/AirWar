package nz.co.aetheric.airwar;

import java.util.LinkedList;
import java.util.List;

public class CardDeck {
    private LinkedList<Card> deck;
	private ArrayList<Card> active;
	private List<Card> discard;

    public CardDeck() {
        this.deck = new LinkedList<Card>();
		this.active = new ArrayList<Card>(5);
		this.discard = new LinkedList<Card>();
		
        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Face face : Card.Face.values()) {
                deck.add(new Card(face, suit));
            }
        }
    }
	
	public boolean draw() {
		for (Card card : active) {
			deck.addFirst(card);
		}
		
		active.clear();
		
		for (int i = 0; i < 5; i++) {
			Card card = deck.removeLast();
			if (card == null) {
				return false;
			}
			
			active.add(card);
		}
		
		return true;
	}

    public void shuffle() {
        Collections.shuffle(deck);
    }
}
