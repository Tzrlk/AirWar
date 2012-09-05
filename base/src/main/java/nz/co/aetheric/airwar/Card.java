package nz.co.aetheric.airwar;

/**
 * This class represents a single card in a 42 card deck.
 */
public class Card implements Comparable<Card> {
    private final Face face;
    private final Suit suit;

    public Card(Face face, Suit suit) {
        this.face = face;
        this.suit = suit;
    }

    public Card(int face, int suit) {
        this.face = Face.valueOf(face);
        this.suit = Suit.valueOf(suit);
    }
	
	@Override
	public int compareTo(Card other) {
		return face.compareTo(other.face);
	}

	//todo: split this into a separate file
    public enum Face implements Comparable<Face> {
        ACE(1),
        TWO(2),
        THREE(3),
        FOUR(4),
        FIVE(5),
        SIX(6),
        SEVEN(7),
        EIGHT(8),
        NINE(9),
        TEN(10),
        JACK(11),
        QUEEN(12),
        KING(13);

        private final int value;

        private Face(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

		//todo: optimise with switch-case
        public static Face valueOf(int value) {
            for (Face face : Face.values()) {
                if (face.value == value) {
                    return face;
                }
            }

            return null;
        }
		
		@Override
		public int compareTo(Face other) {
			//todo: check this is implemented correctly
			return value - other.value;
		}
    }

	//todo: split this into a separate file
    public enum Suit {
        SPADES(1),
        HEARTS(2),
        CLUBS(3),
        DIAMONDS(4);

        private final int value;

        private Suit(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public static Suit valueOf(int value) {
            switch(value) {
				case 1: return Suit.SPADES;
				case 2: return Suit.HEARTS;
				case 3: return Suit.CLUBS;
				case 4: return Suit.DIAMONDS;
				default: return null;
			}
        }
    }
}
