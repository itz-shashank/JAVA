public class arraysum {
   static int sum(int arr[],int ind){
  
    if(ind==arr.length-1)
    return arr[ind];
   
   else
return sum(arr,ind+1)+arr[ind];

}


public static void main(String[] args) {
    int array[]={1,2,3,4,5};
    
    System.out.println(sum(array, 0));
}}