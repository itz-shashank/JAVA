import java.util.Scanner;

public class recursion {
   static void printincreasing(int n){
        if(n==1){
            System.out.println(1);
       return; }
        else{
      printincreasing(n-1);
       System.out.println(n);
        return;
    }
}
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int r= sc.nextInt();
    printincreasing(r);
   
}}
