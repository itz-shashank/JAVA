import java.util.Scanner;
import java.util.*;

public class fibonacci {
    static int fibseries(int n) {

        if (n == 0) {
            return n;

        } else if (n == 1) {
            return n;

        } else {

            return fibseries(n - 1) + fibseries(n - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println("enter number to find fibonacci series");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        for(int i=0;i<r;i++)
       System.out.println(fibseries(i)); 
    }
}
