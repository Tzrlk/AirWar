package nz.co.aetheric.airwar;

/**
 * This class represents a single card in a 42 card deck.
 */
public class Card {
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

    public enum Face {
        ACE(1),
        ONE(1),
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

        public static Face valueOf(int value) {
            for (Face face : Face.values()) {
                if (face.value == value) {
                    return face;
                }
            }

            return null;
        }
    }

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
            for (Suit suit : Suit.values()) {
                if (suit.value == value) {
                    return suit;
                }
            }

            return null;
        }
    }
}
