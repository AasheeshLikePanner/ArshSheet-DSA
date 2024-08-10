package Day1;

public class FindTheDuplicateNumber {
    public static void main(String[] args) {

    }
    public int findDuplicate(int[] nums) {
        sort(nums);
        int ans = 0;
        for(int  i = 0; i<nums.length ;i++){
            if(nums[i] != i){
                ans = nums[i];
            }
        }
        return ans;
    }
    public void sort(int[] arr){
        int  i = 0;
        while(i<arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct] ){
                swap(arr, i , correct);
            }
            else{
                i++;
            }
        }
    }
    public void swap(int[] arr,int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
