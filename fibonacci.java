// link - https://leetcode.com/problems/fibonacci-number/

package Java.Practiceleet;

public class fibonacci {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(fibo(n));
    }
    static int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
