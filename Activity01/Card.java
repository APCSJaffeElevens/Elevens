package Activity01;
import java.util.*;
import java.lang.*;
/**
 * Card.java
 *
 * <code>Card</code> represents a playing card.
 */
public class Card {
 public final static int SPADES = 0;   // Codes for the 4 suits, plus Joker.
   public final static int HEARTS = 1;
   public final static int DIAMONDS = 2;
   public final static int CLUBS = 3;
   public final static int JOKER = 4;
   
   public final static int ACE = 1;      // Codes for the non-numeric cards.
   public final static int JACK = 11;    //   Cards 2 through 10 have their 
   public final static int QUEEN = 12;   //   numerical values for their codes.
   public final static int KING = 13;
   
    /**
     * String value that holds the suit of the card
     */
    private final int suit;
    /**
     * String value that holds the rank of the card
     */
    private String rank;

    /**
     * int value that holds the point value.
     */
    private final int value;
    
    public Card() {
        suit = JOKER;
        value = 1;
    }
   /**
     * Creates a new <code>Card</code> instance.
     *
     * @param cardRank  a <code>String</code> value
     *                  containing the rank of the card
     * @param cardSuit  a <code>String</code> value
     *                  containing the suit of the card
     * @param cardPointValue an <code>int</code> value
     *                  containing the point value of the card
     */
  public Card(int theValue, int theSuit) {
      if (theSuit != SPADES && theSuit != HEARTS && theSuit != DIAMONDS && 
            theSuit != CLUBS && theSuit != JOKER)
         throw new IllegalArgumentException("Illegal playing card suit");
      if (theSuit != JOKER && (theValue < 1 || theValue > 13))
         throw new IllegalArgumentException("Illegal playing card value");
      value = theValue;
      suit = theSuit;
        }


    /**
     * Accesses this <code>Card's</code> suit.
     * @return this <code>Card's</code> suit.
     */
    public int getSuit() {
        return suit;
    }

    /**
     * Accesses this <code>Card's</code> rank.
     * @return this <code>Card's</code> rank.
     */
    public int getValue() {
 return value;
}

    


   /**
     * Accesses this <code>Card's</code> point value.
     * @return this <code>Card's</code> point value.
     */

    public int pointValue() {
     return value;
    }

    /** Compare this card with the argument.
     * @param otherCard the other card to compare to this
     * @return true if the rank, suit, and point value of this card
     *              are equal to those of the argument;
     *         false otherwise.
     */
     public String getSuitAsString() {
      switch ( suit ) {
      case SPADES:   return "Spades";
      case HEARTS:   return "Hearts";
      case DIAMONDS: return "Diamonds";
      case CLUBS:    return "Clubs";
      default:       return "Joker";
      }
   }
   
   /**
    * Returns a String representation of the card's value.
    * @return for a regular card, one of the strings "Ace", "2",
    * "3", ..., "10", "Jack", "Queen", or "King".  For a Joker, the 
    * string is always numerical.
    */
   public String getValueAsString() {
      if (suit == JOKER)
         return "" + value;
      else {
         switch ( value ) {
         case 1:   return "Ace";
         case 2:   return "2";
         case 3:   return "3";
         case 4:   return "4";
         case 5:   return "5";
         case 6:   return "6";
         case 7:   return "7";
         case 8:   return "8";
         case 9:   return "9";
         case 10:  return "10";
         case 11:  return "Jack";
         case 12:  return "Queen";
         default:  return "King";
         }
      }
   }
   
   /**
    * Returns a string representation of this card, including both
    * its suit and its value (except that for a Joker with value 1,
    * the return value is just "Joker").  Sample return values
    * are: "Queen of Hearts", "10 of Diamonds", "Ace of Spades",
    * "Joker", "Joker #2"
    */
   public String toString() {
      if (suit == JOKER) {
         if (value == 1)
            return "Joker";
         else
            return "Joker #" + value;
      }
      else
         return getValueAsString() + " of " + getSuitAsString();
   }
   

} // end class Card

    /**
     * Converts the rank, suit, and point value into a string in the format
     *     "[Rank] of [Suit] (point value = [PointValue])".
     * This provides a useful way of printing the contents
     * of a <code>Deck</code> in an easily readable format or performing
     * other similar functions.
     *
     * @return a <code>String</code> containing the rank, suit,
     *         and point value of the card.
     */
