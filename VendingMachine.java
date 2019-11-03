import java.util.ArrayList;

/**
   A vending machine.
*/
public class VendingMachine
{  
   private ArrayList<Product> products;
   public CoinSet coins;
   public CoinSet currentCoins;

   /**
      Constructs a VendingMachine object.
   */
   public VendingMachine()
   { 
      products = new ArrayList<Product>();
      coins = new CoinSet();
      currentCoins = new CoinSet();
   }
   //ADD REMAINING CODE HERE
    ArrayList<Product> noDuplicates;
   public void addProduct(String description, double price, int quantity){
       for(int i=0; i<quantity; i++){
           products.add(new Product(description, price));
       }
   }
   
   public ArrayList<Product> getProductTypes(){
       //returns array of products without duplicates
       for(int i=0; i<products.size(); i++){
           if(!noDuplicates.contains(products.get(i))){
               noDuplicates.add(products.get(i));
           }
       }
       return noDuplicates;
    }
    
   public void addCoin(Coin coin){
       //allows one coin be inserted at a time
       currentCoins.addCoin(coin);
   }
    
   public void removeMoney(){
   }
}