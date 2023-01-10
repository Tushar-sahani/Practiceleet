package Java.Practiceleet;
public class kthlargest {
    public static void main(String[] args) {
        int[] arr = {3,2,3,1,2,4,5,5,6};
        int a = findKthLargest(arr,4);
        System.out.println(a);
    }
    static int findKthLargest(int[] nums, int k) 
    {
        int max = nums[0];
        for (int i=0;i<nums.length;i++) {
            if(nums[i]>max){
                max = nums[i];
            }
        }
        int count = 0;
        int i=0;
        int b = max;
        while(max>i){
            if(b>=k)
            {
                count++;
            }
            i++;
        }
        return count;
    }
}