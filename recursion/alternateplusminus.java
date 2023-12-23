import java.util.Scanner;

public class alternateplusminus {
    static int series(int n){
        int sum=0;
        if(n==0){
return sum;}
else{
if(n%2==0){
    sum-=n;}
    else{
sum+=n;
    }
    sum+=series(n-1);
    return sum;
}
}
public static void main(String[] args) {
    System.out.println("enter the number");
    try (Scanner sc = new Scanner(System.in)) {
        int r =sc.nextInt();
        System.out.println(series(r));
    }
}
        }
    

