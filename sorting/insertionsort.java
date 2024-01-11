package sorting;

public class insertionsort {
    static void sorting(int arr[]) {

        for (int i = 0; i < arr.length-1; i++) {
            int min = i;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[min]) {
                    min = j;
                   

                }
                if(min!=i){
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }}
    }

    public static void main(String[] args) {
        int arr[] = { 5, 8, 4, 6, 2, 1 };
        sorting(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
