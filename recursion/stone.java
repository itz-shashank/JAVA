public class stone {
    static int stonepeb(int arr[],int n,int ind){
if(ind==n-1) return 0;
int opt1=Math.abs((arr[ind]-arr[ind+1]))+ stonepeb(arr, n, ind+1);
if(ind==n-2) return opt1;
int opt2=Math.abs((arr[ind]-arr[ind+2]))+ stonepeb(arr, n, ind+2);
return Math.min(opt1, opt2);
    }
    

public static void main(String[] args) {
    int h[]={10,30,40,20};
int t=stonepeb(h, h.length, 0);
System.out.println(t);
}}