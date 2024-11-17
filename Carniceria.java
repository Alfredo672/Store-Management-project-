public class Carniceria extends Bullseye{

  private String meat;
  private String seafood;
// This is the constructor method 
  public Carniceria(){
    super();
    meat = "beef";
    seafood = "salmon";
  }


  public Carniceria(double price, int amount, String meat, String seafood){
    super(price, amount);
    this.meat = meat;
    this.seafood = seafood;
  }


public String getMeat(){
  return meat;
}

  public String getSeafood(){
    return seafood;
  }

// This sets the type of meat you are buying
  public void setMeat(String newMeat){
    meat = newMeat;
  }
// This sets the type of seafood you are buying
  public void setSeafood(String newSeafood){
    seafood = newSeafood;
  }

public String toString(){
  return "Meat: " + meat + "\nSeafood: " + seafood + "\n" + super.toString();
}
  
}