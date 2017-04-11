import java.util.Arrays;
import java.util.Scanner;
// Christian Vazquez - Charles

public class LocateSmallestElement {

  public static void findSmallest(String args[], Scanner scan) {
    int[] listArray = new int[] { 32, 8, 4, 16, 21, 6, 30, 94, 22, 27 };
    // List the array for the user to see.
    System.out.println("Here is the provided array that ");
    System.out.println("we will use: " + Arrays.toString(listArray));
    int indexOfMin = 0;
    int min = listArray[indexOfMin];
    int i = 0;
    for (i = 0; i < listArray.length; i++) {
      if (listArray[i] < min) {
        min = listArray[i];
        indexOfMin = i;
      } else {
        continue;
      }
    }
    System.out.println("The smallest value is " + min + " and it was"
        + " located at index " + indexOfMin);
  }

}
