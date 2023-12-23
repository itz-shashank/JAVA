import java.util.Scanner;

public class subsequencessq {
    static void printssq(String s,String currentans){
        if(s.length()==0){
            System.out.println(currentans);
            return;}
           char cur =s.charAt(0);
            String remstring =s.substring(1);
            printssq(remstring,currentans+ cur);
            printssq(remstring,currentans);
            return;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string ");
        String  s =sc.nextLine();
      printssq(s, "");
    }
}
