public class BubbleSort {

    public static void main(String[] args) {

        int[] nums={3,6,8,2,4,1};
        int[] res= bubble(nums, nums.length-1, 0);
        for (int num : res) {
            System.out.print(num + " ");
        }
    }

    static int[] bubble(int[] arr,int r,int c){
        if(r==0){
            return arr;
        }
        if(c<r){
            if(arr[c]>arr[c+1]){
                int temp =arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;
            }
            bubble(arr, r, c+1);
        }
        else{
            bubble(arr, r-1, 0);
        }
        return arr;
    }
}
