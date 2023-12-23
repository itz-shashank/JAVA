public class searchind {
   
        static int searchind(int arr[], int ind, int target) {
            if (ind == arr.length) {
    
                return -1;
            }
    
            if (arr[ind] == target )
            return ind;
    
                return searchind(arr, ind+1, target);
            
    
        }
    
        public static void main(String[] args) {
            int arr[] = { 1, 3,7,6, 5 };
            int target = 7;
      System.out.println(searchind(arr, 0, target));
        }
    }
    

