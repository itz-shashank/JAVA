import java.util.ArrayList;
import java.util.Scanner;

public class subsequence {
    
    static ArrayList<String> getSSQ(String s){
        ArrayList<String> ans =new ArrayList<>();
if(s==""){
   ans.add("");
return ans;
}
char f = s.charAt(0);
ArrayList<String> smallans = getSSQ(s.substring(1));
for(String ss: smallans){
ans.add(ss);
ans.add(f + ss);}
return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string ");
        String  s =sc.nextLine();
        System.out.println(getSSQ(s));
    }
}
