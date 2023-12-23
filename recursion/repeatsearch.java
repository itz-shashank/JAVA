public class repeatsearch {

    static void repsearchind(int arr[], int ind, int target) {
        if (ind == arr.length) {

           return;
        }

        if (arr[ind] == target)
            System.out.println(ind);
        repsearchind(arr, ind + 1, target);
        return;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 7, 4, 4, 4, 6, 5 };
        repsearchind(arr, 0, 4);
    }
}
