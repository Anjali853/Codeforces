import java.util.Arrays;
import java.util.Scanner;

public class Interestingdrink {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int q = sc.nextInt();
        while (q-- > 0) {
        int x = sc.nextInt();
        int left = 0;
        int right = n-1;
        while(left <= right){
            int mid = (left +right)/2;
                                
            if(arr[mid] <= x){
                left = mid +1;
            }
            else{
                right = mid -1;
            }
        }
        System.out.println(left);
    }
}
}