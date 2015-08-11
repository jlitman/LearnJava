public class DeckOfCardsTest
{
    public static void main(String[] args)
    {
        DeckOfCards myDeck = new DeckOfCards();

        //print original state of deck
        System.out.println("Original State of Deck");
        System.out.println(myDeck);
        
        //no need to explicitly call toString, the println causes it to be
        //called automatically
        //System.out.println(myDeck.toString());

        //shuffle the deck
        myDeck.shuffle();

        for(int i = 1; i <=52;i++)
        {
            System.out.printf("%-19s", myDeck.dealCard());
            //put a newline every 4 cards
            if(i % 4 == 0)
                System.out.println();
        }
    }
}
