import java.util.*;

public class Median {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long k = sc.nextLong();

        long[] arr = new long[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextLong();
        }

        Arrays.sort(arr);

        int mid = n / 2;
        long ans = arr[mid];

        int count = 1; 

        for(int i = mid + 1; i < n; i++){
            long diff = arr[i] - ans;

            long need = diff * count;

            if(k >= need){
                k -= need;
                ans = arr[i];
                count++;
            } else {
                ans += k / count;
                k = 0;
                break;
            }
        }

        if(k > 0){
            ans += k / count;
        }

        System.out.println(ans);
    }
}