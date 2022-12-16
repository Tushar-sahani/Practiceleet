// QUESTION LINK

// https://leetcode.com/problems/arranging-coins/

package Java;

public class coinArranging {

    public static void main(String[] args) {
        int i=0;
        int n = 8;
        while(n>0)
        {
            i++;
            n = n-i;
        }
        if(n<0){
            System.out.println(i-1);;
        }
        else{
            System.out.println(i);
        }
    }
}
