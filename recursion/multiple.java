import java.util.Scanner;

public class multiple {
    static void multiple(int n, int k){
        if( k==1){
            System.out.println(n);
            return ;}
            else{
                multiple(n,k-1);
                System.out.println(k*n);
                
            }
        }
    
    public static void main(String[] args) {
        System.out.println("enter n and k>0");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        multiple(n, k);
    }}

