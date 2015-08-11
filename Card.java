public class Card
{
    private String face; //face of card (Ace, Deuce, ...)
    private String suit; //Hearts, diamonds...

    public Card(String cardFace, String cardSuit)
    {
        face = cardFace;
        suit = cardSuit;
    }

    public String toString()
    {
        return face + " of " + suit;
    }
}
