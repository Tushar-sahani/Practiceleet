// LINK - https://leetcode.com/problems/set-mismatch/
package Java.Practiceleet;
class setmismatch {
    public int[] findErrorNums(int[] nums) {
        int[] arr = new int[2];
        int i=0;
        while(i<nums.length){
            if(nums[nums[i]-1] != nums[i]){
                swap(nums,i,nums[i]-1);
            }
            else{
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(j != nums[j]-1){
                arr[0] = nums[j];
                arr[1] = j+1;
            }
        }
        return arr;
    }
    static void swap(int[] nums,int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
