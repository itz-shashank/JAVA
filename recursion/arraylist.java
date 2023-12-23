
import java.util.ArrayList;
public class arraylist {
   static  ArrayList<Integer> searchind(int array[],int ind,int target){
if(ind>=array.length){
    return new ArrayList<Integer>();

}
ArrayList<Integer> ans =new ArrayList<>();
if(array[ind]==target){
ans.add(ind);
   }
   ArrayList<Integer> smallans=searchind(array, ind+1, target);
    ans.addAll(smallans);
    return ans;
   }
   public static void main(String[] args) {
    int arr[]={2,3,4,4,5,4,6};
     ArrayList<Integer> ans=searchind(arr, 0, 4);
   System.out.println(ans);
    }
   }

