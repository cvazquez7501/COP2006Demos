import java.util.Scanner;

//Christian Vazquez - Charles
public class GiveCharlesGrade {

  public static void gradeCharles(Scanner scan, String userName) {
    // Charles will now initiate the first use of if-else
    // statements.
    // The user will be asked to rate Charles, and he will give a
    // response depending on his grade.
    System.out.println("Be honest with me " + userName + ", what would you "
        + "rate me so far? " + "Using a scale from "
        + "0 - 100, rate your experience so far.");
    scan.nextLine();
    int charlesGrade = scan.nextInt();
    char grade = 0;
    if (charlesGrade >= 90) {
      grade = 'A';
    } else if (charlesGrade >= 80) {
      grade = 'B';
    } else if (charlesGrade >= 70) {
      grade = 'C';
    } else if (charlesGrade >= 60) {
      grade = 'D';
    } else if (charlesGrade >= 50) {
      grade = 'F';
    }
    System.out
        .println("The grade I have received is an " + grade + ". Thank you!");
  }
}
