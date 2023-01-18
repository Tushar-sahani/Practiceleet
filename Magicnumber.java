package Java.Practiceleet;

public class Magicnumber {

    public static void main(String[] args) {
        int n = 6;
        int sum = 0;
        // int i=1;
        // while(n>0){
        //     sum += (n%2) * (int)Math.pow(5, i);
        //     n = n/2;
        //     i++;
        // }
        int base = 5;
        while(n>0){
            int last = n&1;
            n = n>>1;
            sum += last * base;
            base = base * 5;
        }
        System.out.println(sum);
    }
}