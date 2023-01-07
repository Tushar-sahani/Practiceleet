// Reverse-Integer

// https://leetcode.com/problems/reverse-integer/


public class reverseint {

    public static void main(String[] args) {
        int x = 1534236469;
        int result = reverseinte(x);
        System.out.println(result);
    }
    static int reverseinte(int x){
        long n = 0;
        
        while(x!=0){
            int i = x%10;
            n = n*10 + i;
            x = x/10;
            if(n>Integer.MAX_VALUE || n<Integer.MIN_VALUE)
			    return 0;
        }
       return (int) n;
    }
}