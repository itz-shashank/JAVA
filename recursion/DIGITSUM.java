import java.util.Scanner;

public class DIGITSUM {
    static int  sumdigit(int n){
        if(n/10==0){
            return n;
        }
int sum =sumdigit(n/10) + n%10;
return sum;
    }
    public static void main(String[] args) {
        System.out.println("enter the number ");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.println(sumdigit(r));
    }
}
