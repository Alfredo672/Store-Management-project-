public class Produce extends Bullseye{
// This is the instance variable 
  String fruit;
  String vegetable;

  public Produce(){
super();
    fruit = "apple";
    vegetable = "onion";
  }
// This is a parameterized constructor method
public Produce(double price, int amount, String fruit, String vegetable){
  super(price, amount);
  this.fruit = fruit;
  this.vegetable = vegetable;
}


 public String getFruit(){
    return fruit;
  }

  public String getVegetable(){
    return vegetable;
  }
// This sets the fruits you are buying 
  public void setFruit(String newFruit){
    fruit = newFruit;
  }
// This sers the vegetable you are buying 
  public void setVegetable(String newVegetable){
    vegetable = newVegetable;
  }

public String toString(){
  return "Fruit: " + fruit + "\nVegetable: " + vegetable + "\n" + super.toString();
}

}