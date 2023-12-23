public class setsum {
    static void printsum(int a[],int ind,int sum,int n){
        if(ind>=n){
            System.out.println(sum);
            return;
        }
        printsum(a, ind+1, sum+a[ind], n);
        printsum(a, ind+1, sum, n);
        return;
    }
    public static void main(String[] args) {
        int arr[]={2,4,5};
        printsum(arr, 0, 0, arr.length);
    }}

