import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
    int arr[]={5,3,1,4,2};
   sort(arr);
   System.out.println(Arrays.toString(arr));
    
}

    private static void sort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    swap(arr, j,j+1);
                    ;
                }
            }
        }
    }

    private static void swap(int arr[],int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    
}