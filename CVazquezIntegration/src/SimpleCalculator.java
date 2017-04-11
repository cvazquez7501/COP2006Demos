import java.util.Scanner;

public class SimpleCalculator {

  public static void easyMath(Scanner scan) {

    // This part is inspired by HackerRank.
    int myInt = 4;
    double myDouble = 4.0;

    // Variables are declared, but will be given value by the user.
    int userInt;
    double userDouble;

    System.out.println("Alright, let's try entering an integer value. "
        + "Type in any integer and we will add it by 4.");
    userInt = scan.nextInt();
    System.out.println("Good, now go ahead and enter an double value."
        + " It can be anything like 1.2 or 4.5... "
        + "Anything with a decimal value." + " It will be added by 4.0");
    userDouble = scan.nextDouble();
    System.out.println("Wonderful. When you click enter again, I will "
        + "analyze and compute all of the" + " information you gave me.");

    System.out.println("Here are the results:");
    System.out.println(myInt + userInt);
    // Add the two integers
    System.out.println(myDouble + userDouble);
    // Add the two doubles
  }
}
