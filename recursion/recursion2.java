import java.util.Scanner;
public class recursion2 {
    

   static int printfact(int n){
    int fact=0;
        if(n==0){
            fact=1;
            return fact;}
        else {
            fact=n*printfact(n-1);
        return fact;
    }
}
public static void main(String[] args) {
    System.out.println("enter number to find factorial");
    Scanner sc =new Scanner(System.in);
    int r= sc.nextInt();
  
    System.out.println( printfact(r)); 
}}


