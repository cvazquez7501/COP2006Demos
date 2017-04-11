import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT.
         * Your class should be named Solution.
         */
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int n = scan.nextInt();
            int cycle;
            int h = 0;
            if (n == 0) {
                h = 1;
            } else {
                for (cycle = 1; cycle <= n; cycle++) {
                    if (cycle % 2 == 1) {
                        h = h * 2;
                    } else {
                        h = h + 1;
                    }
                    System.out.println(h);

                }
            }
        }
    }
}
