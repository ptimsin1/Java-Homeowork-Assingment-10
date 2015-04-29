/*
Prakriti Timsina
CS 110
Assingmetn #10: HumanPlayer Class for War Game
Program Description: Creates the HumanPlayer class
*/

//import what is needd
import java.util.ArrayList;
import java.util.Collection; 

//name class that extend Player
public class HumanPlayer extends Player
{
   /**
   
   */
   private ArrayList<Card> human = new ArrayList<Card>();
   
   /**
   */
   public HumanPlayer(ArrayList<Card> half)
   {
      super(half);
      human = super.getPlayerDeck();
   }   
   
   
   /**
   
   */
   public int takeTurn(String answer)
   {
      int card = -1;
      if(answer.equalsIgnoreCase("y"))
      {
         if(human.isEmpty())
         {
            card = -1;
         }
         card = human.get(0).getRank();
      }
      
       
       else if(answer.equalsIgnoreCase("n"))
       {
          card = -1;
       }
       return card;
      
      
      
   }
   
   
   /** 
   
   */
   public ArrayList<Card> getHumanDeck()
   {
      return human;
   }
   
   
   /** 
   
   */   
   public void countWin(Card c)
   {
      human.add(c);
   }
   
   /**
   
   */
   public void takeAwayLoss()
   {
      human.remove(0);
   }
}

//based of m
//it complies
//use this one
//complies and works
//need to comment