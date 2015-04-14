package Activity02;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class DeckTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class DeckTest
{
    private Deck deck1;
    private Deck deck2;
    private Deck deck3;
    public static void main(String[] args) 
    {
        Deck deck1 = new Deck(new String[] {"1","2","3"}, new String[] {"Diamonds","Hearts","Spades"}, new int[] {1,2,3});
        Deck deck2 = new Deck(new String[] {"Ace","Jack","Queen"}, new String[] {"Spades","Spades","Diamonds"}, new int[] {13,10,11});
        Deck deck3 = new Deck(new String[] {"King","5","7"}, new String[] {"Hearts","Diamonds","Clubs"}, new int[] {12,5,7});
        
       System.out.println(deck1);
       System.out.println(deck2);
        System.out.println(deck3);
   }
 }
