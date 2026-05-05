import java.util.Arrays;
import java.util.Scanner;

public class Kefa {
    static class Friend {
        long money, Friendship;
        Friend(long m, long f){
            money = m;
            Friendship = f;
        } 
    
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long d = sc.nextLong();
        Friend[] arr = new Friend[n];

        for(int i =0; i <n; i++){
            long m = sc.nextLong();
            long s = sc.nextLong();
            arr[i] = new Friend(m, s);
        }
        Arrays.sort(arr,(a,b) -> Long.compare(a.money,b.money));

        long sum = 0;
        long maxsum = 0;
        int left = 0;

        for(int right=0; right < n; right++){
            sum += arr[right].Friendship;
            while (arr[right].money - arr[left].money >= d) {
                sum -= arr[left].Friendship;
                left++;
                
            }
            maxsum = Math.max(maxsum, sum);
        }
        System.out.println(maxsum);

    }
}
