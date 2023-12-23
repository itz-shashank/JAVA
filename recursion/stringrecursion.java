import java.util.Scanner;

public class stringrecursion {
    // static String deletestring(String a, int ind) {
    //     if (ind == a.length()) {
    //         return "";
    //     }
    //     String smallans = deletestring(a, ind + 1);
    //     char ch = a.charAt(ind);
    //     if (ch != 'a') {

    //         return ch + smallans;
    //     } else
    //         return smallans;
    // }
 static String removeoccurance(String s){
    if(s.length()==0) return " ";
    String smallans= removeoccurance(s.substring(1));
    char currentchar= s.charAt(0);
    if(currentchar!='a'){
        return currentchar+ smallans;
    }
    else{ 
    return smallans;}
 }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");

        String s = sc.nextLine();

        System.out.println(removeoccurance(s));
    }
}
