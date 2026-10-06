
import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] nums = {2, 6, 1, 4, 8, 3};
        int[] result = mergeSort(nums);
        for (int num : result) {
            System.err.print(num);
        }

    }

    static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    static int[] merge(int[] first, int[] second) {
        int[] ans = new int[first.length + second.length];
        int i = 0, j = 0, k = 0;
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                ans[k] = first[i];
                i++;
            } else {
                ans[k] = second[j];
                j++;
            }
            k++;
        }
        //It may be possible that one of the arrays is not complete

        // Remaining elements of first
        while (i < first.length) {
            ans[k] = first[i];
            i++;
            k++;
        }

        // Remaining elements of second
        while (j < second.length) {
            ans[k] = second[j];
            j++;
            k++;
        }

        return ans;
    }
}
