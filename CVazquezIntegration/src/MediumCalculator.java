import java.util.Scanner;

public class MediumCalculator {

  public static void midMath(Scanner scan) {

    System.out.println("I'm sure math may not your favorite subject in "
        + "school, but I love it. "
        + "I am a computer after all, so this is pretty easy for me. "
        + "Let's work with some operators.");
    System.out
        .println("You may have seen operators before, symbols like +, -, =, % "
            + "so on and so forth. ");
    System.out
        .println("When used in a program, they can dictate what a variable "
            + "is assigned to, or manipulated by. "
            + "I'll show you what I mean.");
    System.out.println("Go ahead and type in any whole number you'd like. "
        + "I'll assign the variable " + "'yourFirstInteger' to it.");
    int yourFirstInteger = scan.nextInt();
    System.out.println("Alright way to go, you're such a beast. "
        + "You typed in " + yourFirstInteger + " right? "
        + "Do me a favor and type in another number, "
        + "it'll be saved as 'yourSecondInteger'. "
        + "We're gonna use these two numbers in our calculator.");
    int yourSecondInteger = scan.nextInt();
    System.out.println("Let's add these two numbers together. "
        + "You typed in " + yourFirstInteger + " and " + yourSecondInteger
        + " as your two numbers. Let's make some magic happen!");
    System.out
        .println("Remember, both of these numnbers are of the int data type, "
            + "so the result will also be an integer.");
    System.out.println("We will add, subtract, multiply, and divide "
        + "the two numbers, in that order.");

    // Charles will use both of the numbers to perform basic
    // operations.
    // If the result contains a decimal
    // Charles will only output an integer.
    int resultAdd = yourFirstInteger + yourSecondInteger;
    int resultSubtract = yourFirstInteger - yourSecondInteger;
    int resultMultiply = yourFirstInteger * yourSecondInteger;
    int resultDivide = yourFirstInteger / yourSecondInteger;

    System.out.println(resultAdd);
    System.out.println(resultSubtract);
    System.out.println(resultMultiply);
    System.out.println(resultDivide);
    /*
     * The use of if-else statements can be implemented here in order to avoid
     * issues where a number doesn't divide evenly into another.
     */
    System.out.println("Now you may notice that I may or "
        + "may have not gave a result that is 0. This can be "
        + "because of several reasons. " + "if your first integer, "
        + yourFirstInteger + " was smaller ");
    System.out.println("than the second integer " + yourSecondInteger
        + " then it is " + "likely that it "
        + "resulted in a decimal answer, which can only "
        + "be stored in a double or float.");

  }
}
