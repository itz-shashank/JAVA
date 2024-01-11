package sorting;

public class bubblesort {
    static void sort(int arr[]){
        boolean flag =false;
        for(int i=0;i<arr.length-1;i++){
         
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
flag=true;
                }
            }   if(flag==false){
                return;
            }
        }
       
        
    }
    public static void main(String[] args) {
        int arr[]={7,5,4,8,1};
        sort(arr);
         for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
