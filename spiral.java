import java.util.Scanner;


public class spiral {

    static void entermatrix(int r, int c) {
        System.out.println("enter elements of matrix");
        int i;
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[r][c];
        for ( i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {

                arr[i][j] = sc.nextInt();
            }}
            System.out.println("matrix is");
            for ( i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    System.out.println(arr[i][j]);
                }
            }
        }
    

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of row and column");
        int a = sc.nextInt();
        int b = sc.nextInt();
        entermatrix(a, b);
    }}

