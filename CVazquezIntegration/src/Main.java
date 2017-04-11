import java.util.*;
import java.util.Random;

// Christian Vazquez - Integration Project - Charles
public class Main {

  // This is a header
  public static void main(String[] args) {
    // This is a parameter ^^^

    Random r = new Random();

    /* Setting up an array to mark off each completed section. */
    boolean[] isCompleted = new boolean[11];

    // A variable is a location of memory
    // CLASS IS CODE
    String inputString = "Hello there user, my name is Charles. "
        + "I have been tasked with guiding you"
        + " through what will be an interactive journey.";
    // inputString is Charles introducing himself.
    System.out.println("Hello everyone, welcome to ImmersiveQuezt");
    System.out.println(inputString);
    System.out.println("You will be prompted with a list of various topics "
        + "that I will teach you about.");
    System.out.println("Press enter to continue.");

    Scanner scan = new Scanner(System.in);
    scan.nextLine();
    // inputString will be printed out to the user
    // Charles will inform the user of the first task

    System.out.println("To begin, please type in your name.");
    String userName = scan.nextLine();
    System.out.println("Okay, thank you " + userName + "! Let's begin.");
    // (isCompleted[objective] ? "X" : " ")
    int objective;
    do {
      MenuSelection.SelectMenuOption(scan, isCompleted);
      objective = scan.nextInt();
      switch (objective) {
        case 1:
          // This is a call!
          ListDataTypes.showData();
          isCompleted[objective] = true;
          break;
        case 2:
          SayHello.toTheWorld();
          isCompleted[objective] = true;
          break;
        case 3:
          SimpleCalculator.easyMath(scan);
          isCompleted[objective] = true;
          break;
        case 4:
          MediumCalculator.midMath(scan);
          isCompleted[objective] = true;
          break;
        case 5:
          GiveCharlesGrade.gradeCharles(scan, userName); // THIS IS AN ARGUMENT
          isCompleted[objective] = true;
          break;
        case 6:
          AddUpArray.totalSum(scan);
          isCompleted[objective] = true;
          break;
        case 7:
          MinMax.findMinMax(args);
          isCompleted[objective] = true;
          break;
        case 8:
          LocateSmallestElement.findSmallest(args, scan);
          isCompleted[objective] = true;
          break;
        case 9:
          ShoesDemo.favoriteShoes(scan);
          isCompleted[objective] = true;
          break;
        case 10:
          isCompleted[objective] = true;
          break;
        default:
          System.out.println("That is not a valid option, please try again.");
          break;
        case 0:
          break;
      }
      /*
       * Ran into an error where Charles would still tell the user to press
       * enter in order to return to the main menu. Implemented an if-else
       * statement to differentiate between 0 and every other option.
       */
      // This is a relational operator &&.
      if (objective >= 1 && objective <= 10) {
        System.out.println("Press enter to go back to the main menu.");
        scan.nextLine();
        scan.nextLine();
      } else {
        break;
      }
    } while (objective != 0); // Conditional operators
    System.out.println("Thank you for your time!");
    System.out.println("-Charles");
    scan.close();
  }
}
