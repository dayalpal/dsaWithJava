
import java.util.ArrayList;


public class FindItem {

    public static void main(String[] args) {
        int[] items = {1, 5, 6, 3,8,9,8,8, 8, 7};
        ArrayList<Integer> list = new ArrayList();
        System.err.println(findItem(items, 8, 0));
        System.err.println(findIndex2(items, 8, 0));
        System.err.println(findIndex3(items, 8, 0,list));
    }

    static boolean findItem(int[] arr, int target, int index) {
        if (index == arr.length - 1) {
            return false;
        }
        if (index < arr.length - 1) {
            if (arr[index] == target || findItem(arr, target, index + 1)) {
                return true;
            }
        }
        return false;
    }

    static int findIndex2(int[] arr, int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index + 1;
        } else {
            return findIndex2(arr, target, index + 1);
        }

    }


    static ArrayList<Integer> findIndex3(int[] arr, int target, int index, ArrayList<Integer> list) {

    if (index == arr.length) {
        return list;
    }

    if (arr[index] == target) {
        list.add(index);
    }

    return findIndex3(arr, target, index + 1, list);
}
}
