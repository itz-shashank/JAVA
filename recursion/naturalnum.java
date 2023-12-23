import java.util.Scanner;

public class naturalnum {
    
   static void natural(int n){
        if(n==1){
            System.out.println(1);
       return; }
        else{
             System.out.println(n);
      natural(n-1);
      
        return;
    }
}
public static void main(String[] args) {
    System.out.println("enter number");
    Scanner sc =new Scanner(System.in);
    int r= sc.nextInt();
natural(r);
   
}}


