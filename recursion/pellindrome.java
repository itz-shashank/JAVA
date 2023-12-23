import java.util.Scanner;

public class pellindrome {
    static boolean ispallindrome(String s,int l,int r){
        if(l>=r) return true;
        if(s.charAt(r)==s.charAt(l)&& ispallindrome(s, l+1, r-1)) return true ;
        else return false;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String st = sc.nextLine();
        if(ispallindrome(st, 0, 0))
        System.out.println("pallindrome");
        else System.out.println("not a pallindrome");
    }
}
