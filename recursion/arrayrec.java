import java.util.Scanner;

public class arrayrec {
    static void arr(int arr[],int ind){
if(ind == -1){
    return;
}

arr(arr,ind-1);
System.out.println(arr[ind]);
    }

public static void main(String[] args) {
    int arr[]= new int[5];
    System.out.println("enter the array");
    Scanner sc = new Scanner(System.in);
    for(int i =0;i<5;i++){
arr[i]=sc.nextInt();
    }
    arr(arr,4);
}}
