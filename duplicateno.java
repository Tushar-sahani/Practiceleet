// link - https://leetcode.com/problems/find-the-duplicate-number

class Solution {
    public int findDuplicate(int[] arr) {
        int i=0;
        while(i<arr.length){
            if(arr[i] != arr[arr[i]-1]){
                swap(arr,i,arr[i]-1);
            }
            else{
                i++;
            }
        }
        for(int j=0;j<arr.length;j++){
            if(j != arr[j]-1){
                return arr[j];
            }
        }
        return -1;
    }
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}