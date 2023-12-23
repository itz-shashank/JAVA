import java.util.Scanner;

public class apowerb {
    static int fun(int a , int b){
        if(b==0){
            return 1;
        }
        else{
            int pow= a*fun(a,b-1);
            return pow; 
        }
    }
    public static void main(String[] args) {
        System.out.println("enter number a");
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
          System.out.println("enter number b");
        int q =sc.nextInt();
        System.out.println(fun(p,q));
    }
    
}
