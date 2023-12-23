public class arraymax {
    static int arraymax(int array[],int indx){
       
        if(indx==array.length-1)
        return array[array.length-1];
        else{
        ;
            if(array[indx] >arraymax(array,(indx+1))){
            return array[indx];}
            else
            return arraymax(array,(indx+1));}

            }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println(arraymax(arr, 0));
    }
}
