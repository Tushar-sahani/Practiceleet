package Java.Practiceleet;

public class removeduplicy {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,2,3,3};
        System.out.println(removedup(arr));
        
    }
    static int removedup(int[] arr){
        if(arr.length == 0)
            return 0;
        
        int addIndex = 1; 

        for(int i = 0; i < arr.length - 1; i++) {
            
            if(arr[i] < arr[i + 1]){ 
              arr[addIndex] = arr[i + 1];
              addIndex++;
            }
        }
        return addIndex;
    }
}
