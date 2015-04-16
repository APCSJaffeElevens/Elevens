package Activity01;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CardTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CardTest
{
    private Card card1;
    private Card card2;
    private Card card3;
    /**
     * The main method in this class checks the Card operations for consistency.
     *  @param args is not used.
    */
    public static void main(String[] args) 
    {
        Card card1 = new Card("3","Diamonds",3);
        Card card2 = new Card("2","Clubs",2);
        Card card3 = new Card("Ace","Spades",15);
        
        System.out.println(card1);
        System.out.println(card2);
        System.out.println(card3);
        
        System.out.println("\ncard1 = card2: " + card1.matches(card2));
        System.out.println("card2 = card3: " + card2.matches(card3));
        System.out.println("card3 = card1: " + card3.matches(card1));
    }
 }