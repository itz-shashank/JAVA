import java.util.Scanner;

public class reversestring {
    static String reverse(String s){
if(s.length()==0){
    return "";}
    char lastchar= s.charAt(s.length()-1);
   
   String next= reverse(s.substring(0, s.length()-1));
   return lastchar+next;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String st= sc.nextLine();
        String rev=reverse(st);
        System.out.println(rev);
        if(st.equals(rev)) System.out.println("pelindrome");
        else System.out.println("not a pallindrome");
    }
}
