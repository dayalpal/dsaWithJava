
import java.io.Console;

public class IsSorted{
    //Is sorted in assending order or not ?
    public static void main(String[] args) {
        int[] nums={1,2,2,4,5,6};
        System.err.println(isSorted(nums,0));

    }

    static boolean isSorted(int[] arr,int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
             return false;
        }
        return isSorted(arr, i+1);
    }
}