import java.util.Scanner;

public class MenuSelection {

  public static void SelectMenuOption(Scanner scan, boolean[] isCompleted) {
    /*
     * Conditional operators are set to false (blank) and are set to true upon
     * completion of each topic respectively.
     */
    System.out.println("Please select a topic, they are labeled between 1-10.");
    System.out
        .println("[" + (isCompleted[1] ? "X" : " ") + "] Topic 1: Data Types");
    System.out
        .println("[" + (isCompleted[2] ? "X" : " ") + "] Topic 2: Hello World");
    System.out.println(
        "[" + (isCompleted[3] ? "X" : " ") + "] Topic 3: Basic Calculator");
    System.out.println(
        "[" + (isCompleted[4] ? "X" : " ") + "] Topic 4: Integer Division");
    System.out.println("[" + (isCompleted[5] ? "X" : " ")
        + "] Topic 5: If (you == cool ) { then try this ;}");
    System.out.println(
        "[" + (isCompleted[6] ? "X" : " ") + "] Topic 6: Using Arrays");
    System.out
        .println("[" + (isCompleted[7] ? "X" : " ") + "] Topic 7: Max vs. Min");
    System.out.println(
        "[" + (isCompleted[8] ? "X" : " ") + "] Topic 8: Find the Index");
    System.out.println("[" + (isCompleted[9] ? "X" : " ")
        + "] Topic 9: Privately getting Public");
    System.out.println("[" + (isCompleted[10] ? "X" : " ") + "] Intro To CarBuilder");
    System.out.println("Topic 0: Quit the program.");
  }
}
