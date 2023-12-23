public class linearsearch {
    static boolean search(int arr[], int ind, int target) {
        if (ind == arr.length) {

            return false;
        }

        if (arr[ind] == target || search(arr, ind + 1, target))

            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int target = 4;
        if (search(arr, 0, 6)) {
            System.out.println("yes");

        } else
            System.out.println("no");
    }
}
