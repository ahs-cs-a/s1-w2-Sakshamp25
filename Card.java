public class Card {
    private int suit;
    private int rank;

    private Card ( int suit, int rank ){
        this.suit = suit;
        this.rank = rank;

    }
    public Card( ){
        this(3, 13);

    }
    
}
