import java.util.Scanner;

public class gcd {
    static int gcd2(int x,int y){
        if(y==0)
        return x;
        else{
            return gcd2(y, x%y);
        }
    }
    public static void main(String[] args) {
        System.out.println("enter the number x and y");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y= sc.nextInt();
        System.out.println("the gcd of x and y is " + gcd2(x, y));
    }
    
}
