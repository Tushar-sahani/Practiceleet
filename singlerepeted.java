// link - https://leetcode.com/problems/single-number
package Java.Practiceleet;

public class singlerepeted {

    public static void main(String[] args) {
        int[] nums = {2,1,4,2,1};
        int ans =0;
        for(int i=0;i<nums.length;i++){
            ans ^=nums[i];
        }
        System.out.println(ans);
    }
}
