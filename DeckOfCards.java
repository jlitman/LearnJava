import java.util.Random;

public class DeckOfCards
{
    private Card[] deck; //array of Card objects
    private int currentCard; //index of next card to be dealt (0-51)
    private static final int NUMBER_OF_CARDS = 52; //constant # of cards

    //random number generator
    private static final Random randomNumbers = new Random();

    public DeckOfCards()
    {
        String[] faces = {"Ace", "Deuce", "Three", "Four", "Five",
            "Six", "Seven", "Eight", "Nine", "Ten", "Jack", 
            "Queen", "King"};

        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        deck = new Card[NUMBER_OF_CARDS];
        currentCard = 0;

        //populate deck with Card objects
        for(int count = 0; count < deck.length; ++count)
        {
            deck[count] = new Card(faces[count % 13], suits[count/13]);
        }
    }

    //shuffle deck of Cards with one pass algorithm
    public void shuffle()
    {
        //after shuffling, dealing should start at deck[0] again
        currentCard = 0;

        //for each card, pick another random Card and swap
        for(int first = 0; first < deck.length; ++first)
        {
            //select random number between 0 and 51
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);

            //swap current Card with randomly selected Card
            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }

    //deal one card
    public Card dealCard()
    {
        //detemine if any Cards remain to be dealt
        if(currentCard < deck.length)
        {
            return deck[currentCard++];
        }
        else 
        {
            return null;
        }
    }

    //print the deck
    public String toString()
    {
        String output = "";
        for(int count = 0; count < deck.length; ++count)
        {
            output += deck[count].toString() + "\n";
        }
        return output;
    }
}


