import java.util.Scanner;

public class ShoesDemo {

  public static void favoriteShoes(Scanner scan) {

    Shoes myShoe;
    myShoe = new Shoes("Nike", "Red", 11.5);

    Shoes yourShoe;
    yourShoe = new Shoes();
    System.out.println("What are your favorite brand of shoes?");
    String brand = scan.next();
    yourShoe.setBrand(brand);
    System.out.println("What color are your shoes?");
    String color = scan.next();
    yourShoe.setColor(color);
    System.out.println("What is your shoe size?");
    double shoeSize = scan.nextDouble();
    yourShoe.setShoeSize(shoeSize);

    System.out.println("The brand of your shoes are: " + yourShoe.getBrand());
    System.out
        .println("The color of your shoes are: " + yourShoe.getShoeColor());
    System.out.println("The size of your shoes are " + yourShoe.getShoeSize());

    System.out.println("The brand of my new shoes are: " + myShoe.getBrand());
    System.out.println("The color of my shoes are: " + myShoe.getShoeColor());
    System.out.println("My shoe size is: " + myShoe.getShoeSize());
  }
}
