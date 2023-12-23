import java.util.Scanner;

public class igcd {
    static int divisor(int n,int k,int c){
        int d=0;
        if(c==1){  
            d=1;
            return d;
        }
        if(n%c==0 && k%c==0){
 d = c;
        
        }
        return d = divisor(n, k, c-1);}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ente the number r and k : ");
        int r = sc.nextInt();
        int k = sc.nextInt();
        if(r>k){
           System.out.println("the gcd is " + divisor(r, k, k));}
        else {
           System.out.println("the gcd is " + divisor(r, k, r));
        }
    }
}
