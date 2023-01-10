package Java.Practiceleet;
import java.util.*;
public class bubble{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {5,3,2,1,4};
        boolean swaped;
        for(int i=0;i<arr.length;i++){
            swaped = false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaped = true;
                }
            }
            if(!swaped){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
            
      
        sc.close();
        
    }
}
