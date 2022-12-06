// Palindrom-Number

// https://leetcode.com/problems/palindrome-number/

package Java;  // this is from tushar shahani

public class palindrome {

    public static void main(String[] args) {
        int x = -121;
        boolean result = palindrome(x);
        System.out.println(result);
    }
    static boolean palindrome(int x){
        int n = 0;
        int m = Math.abs(x);
        while(x!=0){
            int i = x%10;
            n = n*10+i;
            x=x/10;
        }
        return n==m?true:false;
    }
}