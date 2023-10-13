public class Ram {
    public static void main(String[] args) {
       int n=6;
        int[] arr =new int[n + 1];
        arr[1]=1;
        arr[0]=0;
        for (int i = 0; i <= n; i++) {
            arr[i]=arr[i-1]+arr[i-2];
        }
        System.out.println(arr[n]);
    }
}
