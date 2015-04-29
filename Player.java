/*
Prakriti Timsina
CS 110
Assingmetn #10: Payer Class for War Game
Program Description: Creates the player class
*/

//import what is needed
import java.util.ArrayList;
import java.util.Collections;

//name class
public class Player
{
   /**
   
   */
   private ArrayList<Card> playerOne = new ArrayList<Card>();
   
   
   /**
   
   */
   public Player(ArrayList<Card> half)
   {
      for(int i=0; i<half.size(); i++)
      {
         playerOne.add(half.get(i));
      }
      Collections.shuffle(playerOne);
   }
   
   
   /**
   
   */
   public ArrayList<Card> getPlayerDeck()
   {
      return playerOne;
   }
   
   
   /**
   
   */
   public int takeTurn()
   {
      if(playerOne.isEmpty())
      {
         int card = -1;
      }
      int card = playerOne.get(0).getRank();
      return card;
   }  
   
   
   /**
   
   */
   public void countWin(Card c)
   {
      playerOne.remove(0); 
   }  
   
   
   /**
   
   */
   public void takeAwayLoss()
   {
      playerOne.remove(0); 
   }
}
//complies!
//based of m
//change name
//use this one
//complies and works
//commment