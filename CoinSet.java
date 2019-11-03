import java.util.ArrayList;

/**
   A set of coins.
*/
public class CoinSet
{  
   private ArrayList<Coin> set;

   /**
      Constructs a CoinSet object.
   */
   public CoinSet()
   {  
      set = new ArrayList<Coin>();
   }
   //ADD REMAINING CODE HERE
   
   public void addCoin(double value, String description){
       set.add(new Coin(value, description));
   }
}