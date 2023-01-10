// link - https://leetcode.com/problems/first-missing-positive/
package Java.Practiceleet;
class MissingPositive {
    public int firstMissingPositive(int[] nums) {
        int i = 0;
        while(i<nums.length){
            if(nums[i]>0 &&nums[i]<=nums.length && nums[nums[i]-1] != nums[i] ){
                swap(nums,i,nums[i]-1);
            }
            else{
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if( j != nums[j]-1){
                return j+1;
            }
        }
    return nums.length+1;
    }
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}