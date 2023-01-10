package Java.Practiceleet;
import java.util.Scanner;
public class football {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(footbal(s));
        sc.close();
    }
    static String footbal(String s){
        int count0 = 0,count1 = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '0'){
                count1 = 0;
                count0 += 1;
                if(count0==7){
                    return "YES";
                }
            }
            else{
                count0 = 0;
                count1 += 1;
                if(count1>=7){
                    return "YES";
                }
            }
        }
        return "NO";
    }
}

