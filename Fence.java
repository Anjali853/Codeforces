import java.util.Scanner;

public class Fence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        long sum  = 0;
        for(int i = 0; i <k; i++){
            sum += arr[i];
        }
        long minSum = sum;
        int index = 0;

        for(int i = k; i <n; i++){
            sum += arr[i];
            sum -= arr[i - k];

            if(sum < minSum){
                minSum = sum;
                index = i - k + 1;
            }
            
        }
        System.out.println(index + 1);
    }
}
