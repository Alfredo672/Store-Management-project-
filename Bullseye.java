public class Bullseye{
// Creates an instance variable for this class
private double price;
private int amount;


//This is an constructor method 
  public Bullseye(){
    price = 10.99;
    amount = 5;
  }
  public Bullseye(double price, int amount){
    this.price = price;
    this.amount = amount;
  }


  public double getPrice(){
    return price;
  }
// This returns the value of the instance variables 
  public int getAmount(){
    return amount;
  }

  public void setPrice(double newPrice){
    price = newPrice;
  }
// This shows the quantity of items you will get
  public void setAmount(int newAmount){
    amount = newAmount;
  }

  public String toString(){
return "Price: " + price + "\nAmount: " + amount;
  }



  
}