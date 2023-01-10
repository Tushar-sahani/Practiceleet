// link - https://codeforces.com/problemset/problem/50/A
package Java.Practiceleet;
import java.util.*;
public class Dominopiling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println((int)Math.ceil((m*n)/2));
        sc.close();
    }
}