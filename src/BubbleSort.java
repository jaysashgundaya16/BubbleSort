
import java.util.Arrays;


public class BubbleSort {
    public static void main(String[]args){
        String[] strArray = {"jaysash", "Catherene", "farah", "gundaya", "Labinisia", "Gundaya,"};
       
        System.out.println("Original String Array: " + Arrays.toString(strArray));
        
        bubbleSort(strArray);
        
        System.out.println("Sorted String Array" + Arrays.toString(strArray));
       
    }
    static void bubbleSort(String[]arr){
        int n = arr.length;
        
        for(int i = 0; i < n - 1;i++){
            for(int j = 0; j < n - i - 1;j++){
                if(arr[j].compareTo(arr[j + 1])>0){
                    // swap temp and arr[i]
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    
                }
            }
            
        }
    }
}
