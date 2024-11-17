import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

    // Creates a Scanner object - feel free to delete if not using!
    Scanner input = new Scanner(System.in);
Bullseye store = new Bullseye();
Carniceria one = new Carniceria(15.99, 4, "Chicken", "Salmon");
    Produce two = new Produce(7.99, 5, "Watermelon", "Carrots");
    System.out.println(store);
    System.out.println();
    // This line prints out the information of the objects
    System.out.println(one);
System.out.println();
    
    System.out.println(two);




    // Closes the Scanner object
    input.close();
    
  }
}