import java.util.Scanner;

public class AddUpArray {

  public static void totalSum(Scanner scan) {

    System.out.println("Some might say that learning about arrays "
        + "is element-array *ba-dum tsk*."
        + " By definition, an array is a container "
        + "object that holds a fixed number");
    System.out.println("of values of a single type. Values stored in an "
        + "array are called elements.");
    System.out.println("Let's practice. We will set up an array "
        + "with n elements, and then add "
        + "all of those elements together. The sum will "
        + "then be printed out.");
    System.out.println(
        "After selecting how many elements you want, " + "type in 'n' values.");
    System.out.println("For example, if you type in 4, you would then "
        + "type in any 4 values.");
    int n = scan.nextInt();
    int arr[] = new int[n];
    int sum = 0;
    for (int arr_i = 0; arr_i < n; arr_i++) {
      arr[arr_i] = scan.nextInt();
      sum = sum + arr[arr_i];
    }
    System.out
        .println("The sum of the given elements is: " + sum + ". Well done!");
  }
}
