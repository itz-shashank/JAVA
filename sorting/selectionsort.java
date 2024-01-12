package sorting;

public class selectionsort {
    static void sorting(int arr[]){
        int n=arr.length;
        for(int i =1;i<n-1;i++){
            int key =arr[i];
            for(int j=i-1;j>=0;j--){
                if(arr[j]<key){
                    arr[j+1]=arr[j];
                    arr[j]=key;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={5,8,6,4,2};
        sorting(arr);
        for(int u=0;u<arr.length;u++){
            System.out.print(arr[u]+" ");
        }
    }
}
