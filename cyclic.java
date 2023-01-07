
public class cyclic {
    public static void main(String[] args) {
        int[] arr = {3,0,1};
        int i=0;
        while(i < arr.length){
            if(arr[i]<arr.length && i != arr[i]){
                swap(arr,i,arr[i]);
                continue;
            }
            else{
                i++;
            }
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j] != j){
                System.out.println(j);
                break;
            }
        }
       
        
    }
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
