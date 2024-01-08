public class keypad {
    static void comb(String s,String kp[],String res){
        if(s.length()==0) {
System.out.print(res+" ");
return ;}
int currNum = s.charAt(0) -'0';
String currChoices= kp[currNum]; 
for(int i =0;i<currChoices.length();i++){
    comb(s.substring(1), kp, res + currChoices.charAt(i));
}
    }
    public static void main(String[] args) {
        String s="23";
        String kp[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        String res="";
        comb(s, kp, res);
    }
    
}
